package questao2;

public class Main {
    public static void main(String[] args) {

        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.adicionaItem(new Item("Notebook", 3500.00, 1));
        carrinho.adicionaItem(new Item("Mochila", 120.00, 1));

        // Define frete e calcula (peso total: 3kg)
        System.out.println("\n>> Comparando fretes:");
        carrinho.setFreteStrategy(new SedexFrete());
        carrinho.calculaFrete(3.0);

        carrinho.setFreteStrategy(new NormalFrete());
        carrinho.calculaFrete(3.0);

        // Escolhe Sedex e paga com PIX
        System.out.println("\n>> Pedido final com SEDEX + PIX:");
        carrinho.setFreteStrategy(new SedexFrete());
        carrinho.calculaFrete(3.0);
        carrinho.setPagamentoStrategy(new PixPagamento());
        carrinho.realizaPagamento();
    }
}
