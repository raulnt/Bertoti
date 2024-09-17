import java.util.ArrayList;
import java.util.List;

public class Pasta implements Documento {
    private final String nome;
    private final List<Documento> documentos = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionar(Documento doc) {
        documentos.add(doc);
    }

    public void remover(Documento doc) {
        documentos.remove(doc);
    }
    
    @Override
    public void mostrar() {
        System.out.println("Pasta " + nome);
        for (Documento doc : documentos) {
            doc.mostrar();
        }
    }
}
