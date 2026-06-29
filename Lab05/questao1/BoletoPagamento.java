package questao1;

public class BoletoPagamento implements PagamentoStrategy {

    @Override
    public void realizarPagamento(double valor) {
        System.out.printf("Pagamento de R$ %.2f será realizado via Boleto Bancário!%n", valor);
        System.out.println("Boleto gerado! Vencimento em 3 dias úteis.");
    }
}
