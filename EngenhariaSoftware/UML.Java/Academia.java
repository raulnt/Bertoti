import java.util.ArrayList;
import java.util.List;

public class Academia {
    
private String nome;
    private String endereco;
    private List<Aluno> alunos;
    private List<Instrutor> instrutores;


    public Academia(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.alunos = new ArrayList<>();
        this.instrutores = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarInstrutor(Instrutor instrutor) {
        instrutores.add(instrutor);
    }

    public Aluno[] listaAlunos() {
        return alunos.toArray(new Aluno[0]);
    }

    public Instrutor[] listaInstrutor() {
        return instrutores.toArray(new Instrutor[0]);
    }
}

