package DesignPattern.Strategy;

public class CarrinhoDeCompras {
    private Pagamento pagamento;

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void efetuar(int valor) {
        pagamento.pagar(valor);
    }

}''
