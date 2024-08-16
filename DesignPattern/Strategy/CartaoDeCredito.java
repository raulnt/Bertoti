package DesignPattern.Strategy;

    public class CartaoDeCredito implements Pagamento {
        private String numeroCartao;
        private String titular;

    public CartaoDeCredito(String numeroCartao, String titular){
        this.numeroCartao = numeroCartao;
        this.titular = titular;
    }

    @Override
    public void pagar(int valor){
        System.out.println("Pagando " + valor + " usando Cartão de Crédito.");
    }
}