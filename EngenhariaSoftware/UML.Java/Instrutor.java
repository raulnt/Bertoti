public class Instrutor {
    
private final String nome;
    private boolean ocupado;

    public Instrutor(String nome) {
        this.nome = nome;
        this.ocupado = false;
    }

    public void mostrarDetalhes() {
        System.out.println("Nome do instrutor: " + nome);
        System.out.println("Ocupado: " + (ocupado ? "Sim" : "Não"));
    }

    public void atenderAluno() {
        if (!ocupado) {
            System.out.println("Instrutor " + nome + " está atendendo um aluno.");
            ocupado = true;
        } else {
            System.out.println("Instrutor " + nome + " já está ocupado.");
        }
    }
}
