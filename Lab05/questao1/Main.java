package questao1;

public class Main {
    public static void main(String[] args) {

        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.adicionaItem(new Item("Teclado Mecânico", 350.00, 1));
        carrinho.adicionaItem(new Item("Mouse Gamer", 150.00, 2));
        carrinho.adicionaItem(new Item("Headset", 200.00, 1));

        // --- Pagamento via PIX ---
        System.out.println("\n>> Pagando com PIX:");
        carrinho.setPagamentoStrategy(new PixPagamento());
        carrinho.realizaPagamento();

        // --- Pagamento via Cartão ---
        System.out.println("\n>> Pagando com Cartão (3x):");
        carrinho.setPagamentoStrategy(new CartaoPagamento(3));
        carrinho.realizaPagamento();

        // --- Pagamento via Boleto ---
        System.out.println("\n>> Pagando com Boleto:");
        carrinho.setPagamentoStrategy(new BoletoPagamento());
        carrinho.realizaPagamento();
    }
}
