public class Arquivo implements Documento {
    private final String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void mostrar() {
        System.out.println("Arquivo " + nome);
    }

}
