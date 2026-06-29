package questao4;

// O Investidor é o Observer. Ele monitora o preço e age via AcaoBroker.
public class Investidor implements InvestidorObserver {

    private String nome;
    private double precoMinimo;  // se atingir, compra mais
    private double precoMaximo;  // se atingir, vende tudo
    private int quantidadeAcoes;
    private AcaoBroker broker;

    public Investidor(String nome, double precoMinimo, double precoMaximo,
                      int quantidadeAcoes, AcaoBroker broker) {
        this.nome = nome;
        this.precoMinimo = precoMinimo;
        this.precoMaximo = precoMaximo;
        this.quantidadeAcoes = quantidadeAcoes;
        this.broker = broker;
    }

    @Override
    public void notificar(String ticker, double precoAtual) {
        System.out.printf("  [Investidor %s] Notificado: %s está em R$ %.2f " +
                "(limite venda: R$ %.2f | limite compra: R$ %.2f)%n",
                nome, ticker, precoAtual, precoMaximo, precoMinimo);

        if (precoAtual >= precoMaximo) {
            System.out.printf("  ↑ Preço máximo atingido! Ordenando VENDA ao broker...%n");
            broker.vender(nome, ticker, quantidadeAcoes, precoAtual);

        } else if (precoAtual <= precoMinimo) {
            System.out.printf("  ↓ Preço mínimo atingido! Ordenando COMPRA ao broker...%n");
            broker.comprar(nome, ticker, 10, precoAtual); // compra 10 ações adicionais
        }
    }

    public String getNome() { return nome; }
}
