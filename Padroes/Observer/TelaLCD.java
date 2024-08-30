// Outro Observador Concreto
public class TelaLCD implements Observer {
    @Override
    public void atualizar(float temperatura) {
        System.out.println("Tela LCD exibindo temperatura atual: " + temperatura + "°C");
    }
}
