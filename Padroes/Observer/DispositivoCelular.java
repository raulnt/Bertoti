// Classe Observador Concreto
public class DispositivoCelular implements Observer {
    private String nome;

    public DispositivoCelular(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(float temperatura) {
        System.out.println("Dispositivo " + nome + " exibindo temperatura: " + temperatura + "°C");
    }
}
