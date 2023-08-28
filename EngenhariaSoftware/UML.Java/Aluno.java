public class Aluno {
    
    private String nome;
    private int idade;
    private String plano;

    public Aluno(String nome, int idade, String plano) {
        this.nome = nome;
        this.idade = idade;
        this.plano = plano;
    }

    public void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Plano: " + plano);
    }

    public void chamarInstrutor() {
        System.out.println("Chamando instrutor...");
    }
}