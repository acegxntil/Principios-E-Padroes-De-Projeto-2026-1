package questao2;

public class PixPagamento implements PagamentoStrategy {

    @Override
    public void realizarPagamento(double valor) {
        System.out.printf("Pagamento de R$ %.2f realizado via PIX!%n", valor);
        System.out.println("Chave PIX gerada. Aguardando confirmação...");
    }
}
