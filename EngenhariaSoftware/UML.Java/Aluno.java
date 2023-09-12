public class Aluno {
    
    //Atributos
    private String email;
    private String nome;
    private float peso;

    public Aluno(String email, String nome, float peso){
        this.email = email;
        this.nome = nome;
        this.peso = peso;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    public float getPeso(){
        return peso;
    }



}
