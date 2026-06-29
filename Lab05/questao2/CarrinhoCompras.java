package questao2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> itens = new ArrayList<>();
    private PagamentoStrategy pagamentoStrategy;
    private FreteStrategy freteStrategy;
    private double pesoTotalKg;

    public void setPagamentoStrategy(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
    }

    public void setFreteStrategy(FreteStrategy freteStrategy) {
        this.freteStrategy = freteStrategy;
    }

    public void adicionaItem(Item item) {
        itens.add(item);
        System.out.println("Item adicionado: " + item);
    }

    public void removeItem(Item item) {
        itens.remove(item);
        System.out.println("Item removido: " + item.getNome());
    }

    public double calculaTotal() {
        return itens.stream().mapToDouble(Item::getSubtotal).sum();
    }

    // Calcula o frete usando a estratégia escolhida
    public double calculaFrete(double pesoKg) {
        if (freteStrategy == null) {
            System.out.println("Nenhuma estratégia de frete selecionada!");
            return 0;
        }
        this.pesoTotalKg = pesoKg;
        double valorFrete = freteStrategy.calcularFrete(pesoKg);
        System.out.printf("Frete (%s): R$ %.2f%n", freteStrategy.getNome(), valorFrete);
        return valorFrete;
    }

    public void realizaPagamento() {
        if (pagamentoStrategy == null) {
            System.out.println("Erro: nenhuma forma de pagamento selecionada!");
            return;
        }
        if (itens.isEmpty()) {
            System.out.println("Carrinho vazio!");
            return;
        }

        double frete = (freteStrategy != null) ? freteStrategy.calcularFrete(pesoTotalKg) : 0;
        double totalComFrete = calculaTotal() + frete;

        System.out.println("\n=== Resumo do Pedido ===");
        itens.forEach(System.out::println);
        System.out.printf("Subtotal:  R$ %.2f%n", calculaTotal());
        System.out.printf("Frete:     R$ %.2f%n", frete);
        System.out.printf("Total:     R$ %.2f%n", totalComFrete);
        System.out.println("========================");

        pagamentoStrategy.realizarPagamento(totalComFrete);
    }
}
