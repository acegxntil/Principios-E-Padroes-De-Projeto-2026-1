package questao1;

public class CartaoPagamento implements PagamentoStrategy {

    private int numeroParcelas;

    public CartaoPagamento(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    @Override
    public void realizarPagamento(double valor) {
        double valorParcela = valor / numeroParcelas;
        System.out.printf("Pagamento de R$ %.2f realizado via Cartão de Crédito!%n", valor);
        System.out.printf("Parcelado em %dx de R$ %.2f%n", numeroParcelas, valorParcela);
    }
}
