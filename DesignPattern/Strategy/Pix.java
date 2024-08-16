package DesignPattern.Strategy;

public class Pix implements Pagamento{
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void pagar(int valor) {
        System.out.println("Pagando " + valor + " usando PIX.");
    }
}
