import java.util.ArrayList;
import java.util.List;

public class SistemaAcademia {
    private String nomeAcademia;
    private List<Aluno> alunos;
    private List<Professor> professores;

    public SistemaAcademia() {
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
    }

    public void setNomeAcademia(String nomeAcademia) {
        this.nomeAcademia = nomeAcademia;
    }

    public String getNomeAcademia(){
        return nomeAcademia;
    }
    
    public void cadastrarAluno (Aluno aluno){
        aluno.add(aluno);
    }

    public void cadastrarProfessor (Professor professor){
        professor.add(professor);
    }

    public Aluno buscarAlunoEmail(String email){
        for (Aluno aluno : alunos) {
            if (aluno.getEmail().equals(email)){
                return aluno;
            }
        }
    }
    public Professor buscaProfessorId(int id){
        for (Professor professor : professores) {
            if (professor.getId() == id) {
                return professor;
            }
        }
    }
    public void alterarPesoAluno(String email, float novoPeso) {
        for(Aluno aluno : alunos) {
            if (aluno.getEmail().equals(email)) {
                aluno.setPeso(novoPeso);
                return;
            }
        }
    }
    public void alterarTurnoProfessor(int id, String NovoTurno){
        for(Professor professor : professores){
            if (professor.getId() == id) {
                professor.setTurno(NovoTurno);
                return;
            }
        }
    }
}
