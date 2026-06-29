package questao1;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> itens = new ArrayList<>();
    private PagamentoStrategy pagamentoStrategy;

    // Define qual estratégia de pagamento será usada
    public void setPagamentoStrategy(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
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

    public void realizaPagamento() {
        if (pagamentoStrategy == null) {
            System.out.println("Erro: nenhuma forma de pagamento selecionada!");
            return;
        }
        if (itens.isEmpty()) {
            System.out.println("Carrinho vazio!");
            return;
        }

        System.out.println("\n=== Resumo do Pedido ===");
        itens.forEach(System.out::println);
        System.out.printf("Total: R$ %.2f%n", calculaTotal());
        System.out.println("========================");

        pagamentoStrategy.realizarPagamento(calculaTotal());
    }
}
