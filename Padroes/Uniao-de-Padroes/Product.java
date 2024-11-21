//COMPOSITE

package Padroes.Uniao-de-Padroes;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {
    public abstract double getPrice();
}

public class Product extends Component {
    private final String name;
    private final double basePrice;
    private final PricingStrategy pricingStrategy;

    public Product(String name, double basePrice, PricingStrategy strategy) {
        this.name = name;
        this.basePrice = basePrice;
        this.pricingStrategy = strategy;
    }

    @Override
    public double getPrice() {
        return pricingStrategy.calculate(basePrice);
    }

    public String getName() {
        return name;
    }
}

public class Category extends Component {
    private final List<Component> components = new ArrayList<>();

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public double getPrice() {
        return components.stream().mapToDouble(Component::getPrice).sum();
    }
}

