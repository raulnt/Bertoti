package com.meuprimeirorest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@RestController
@RequestMapping("/whey")
class RestApiDemoController {

	private List<Whey> wheys = new ArrayList<>();

	public RestApiDemoController()
			{wheys.addAll(List.of(
				new Whey("Sabor LeiteNinho"),
				new Whey("Sabor Chocolate"),
				new Whey("Sabor Baunilia"),
				new Whey("Sabor Morango")
		));
	}

	@GetMapping
	Iterable<Whey> getWheys() { return wheys; }

	@GetMapping("/{id}")
	Optional<Whey> getWheyById(@PathVariable String id) {
		for(Whey c: wheys) {
			if (c.getId().equals(id)) {
				return Optional.of(c);
			}
		}

		return Optional.empty();
	}

	@PostMapping
	Whey postWhey(@RequestBody Whey whey) {
		wheys.add(whey);
		return whey;
	}

	@PutMapping("/{id}")
	ResponseEntity<Whey> putWhey(@PathVariable String id, @RequestBody Whey whey) {
		int wheyIndex = -1;

		for (Whey c : wheys) {
			if (c.getId().equals(id)) {
				wheyIndex = wheys.indexOf(c);
				wheys.set(wheyIndex, whey);
			}
		}
		return (wheyIndex == -1) ?
				new ResponseEntity<>(postWhey(whey), HttpStatus.CREATED) :
				new ResponseEntity<>(whey, HttpStatus.OK) ;
	}

	@DeleteMapping("/{id}")
	void deleteWhey(@PathVariable String id) { wheys.removeIf(c -> c.getId().equals(id)); }
}

class Whey {

	private final String id;

	private String flavor;

	public Whey(String id, String flavor){
		this.id = id;
		this.flavor = flavor;
	}

	public Whey(String flavor) {this(UUID.randomUUID().toString(), flavor); }

	public String getId() { return id; }

	public String getFlavor() {return flavor; }

public void setFlavor(String flavor) { this.flavor = flavor; }

}