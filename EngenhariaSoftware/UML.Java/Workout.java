public class Workout {
    public static void main(String[] args) {
       
        Academia academia = new Academia("Academia Fitness", "Rua Principal, 123");

        Aluno aluno1 = new Aluno("Alice", 25, "Plano Premium");
        Aluno aluno2 = new Aluno("Bob", 30, "Plano Básico");

        academia.adicionarAluno(aluno1);
        academia.adicionarAluno(aluno2);

        Instrutor instrutor1 = new Instrutor("Dani");
        Instrutor instrutor2 = new Instrutor("Raul");

        academia.adicionarInstrutor(instrutor1);
        academia.adicionarInstrutor(instrutor2);

        System.out.println("Detalhes dos Alunos:");
        for (Aluno aluno : academia.listaAlunos()) {
            aluno.mostrarDetalhes();
            System.out.println();
        }

        System.out.println("Detalhes dos Instrutores:");
        for (Instrutor instrutor : academia.listaInstrutor()) {
            instrutor.mostrarDetalhes();
            System.out.println();
        }

        instrutor1.atenderAluno();
        instrutor2.atenderAluno();
        instrutor1.atenderAluno();
    }
}
