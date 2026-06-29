package questao4;

// O Broker executa as ordens de compra e venda no mercado
public class AcaoBroker {

    private String nome;

    public AcaoBroker(String nome) {
        this.nome = nome;
    }

    public void vender(String nomeInvestidor, String ticker, int quantidade, double preco) {
        System.out.printf("  [%s] VENDA executada: %s vendeu %d ações de %s a R$ %.2f (Total: R$ %.2f)%n",
                nome, nomeInvestidor, quantidade, ticker, preco, preco * quantidade);
    }

    public void comprar(String nomeInvestidor, String ticker, int quantidade, double preco) {
        System.out.printf("  [%s] COMPRA executada: %s comprou %d ações de %s a R$ %.2f (Total: R$ %.2f)%n",
                nome, nomeInvestidor, quantidade, ticker, preco, preco * quantidade);
    }
}
