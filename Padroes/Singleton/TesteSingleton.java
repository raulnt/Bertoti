package Singleton;

public class TesteSingleton {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstancia();
        singleton1.mostrarMensagem();

        Singleton singleton2 = Singleton.getInstancia();
        singleton2.mostrarMensagem();

        System.out.println("São a mesma instância? " + (singleton1 == singleton2));
    }
}

