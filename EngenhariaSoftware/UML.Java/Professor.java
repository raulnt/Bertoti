public class Professor {
    
    private int id;
    private String nome;
    private String turno;

    public Professor(int id, String nome, String turno){
        this.id = id;
        this.nome = nome;
        this.turno = turno;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setTurno(String turno){
        this.turno = turno;
    }
    public String getTurno(){
        return turno;
    }
}
