package Singleton;

public class Singleton {
    private static Singleton instanciaUnica;

    private Singleton() {
        System.out.println("Instância do Singleton criada!");
    }

    public static Singleton getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Singleton();
        }
        return instanciaUnica;
    }

    public void mostrarMensagem() {
        System.out.println("Padrão Singleton em ação!");
    }
}
