package DesignPattern.Strategy;

public class FinalizarCompra {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.setPagamento(new CartaoDeCredito("9876-7895-7412-5321", "Otaviano Chiquinho"));
        carrinho.efetuar(100);
        
        carrinho.setPagamento(new Pix("meuEmail@meupix.com"));
        carrinho.efetuar(200);
    }
}
