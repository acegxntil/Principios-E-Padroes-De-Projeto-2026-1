package questao4;

import java.util.ArrayList;
import java.util.List;

// A Ação é o Subject. Quando o preço muda, notifica todos os investidores inscritos.
public class Acao implements AcaoObservable {

    private String ticker;
    private double preco;
    private List<InvestidorObserver> investidores = new ArrayList<>();

    public Acao(String ticker, double precoInicial) {
        this.ticker = ticker;
        this.preco = precoInicial;
        System.out.printf("[Ação %s] Criada com preço inicial R$ %.2f%n", ticker, preco);
    }

    @Override
    public void registrarInvestidor(InvestidorObserver investidor) {
        investidores.add(investidor);
        if (investidor instanceof Investidor inv) {
            System.out.printf("[Ação %s] Investidor '%s' registrado.%n", ticker, inv.getNome());
        }
    }

    @Override
    public void removerInvestidor(InvestidorObserver investidor) {
        investidores.remove(investidor);
        if (investidor instanceof Investidor inv) {
            System.out.printf("[Ação %s] Investidor '%s' removido.%n", ticker, inv.getNome());
        }
    }

    @Override
    public void notificarInvestidores() {
        for (InvestidorObserver investidor : investidores) {
            investidor.notificar(ticker, preco);
        }
    }

    // Quando o preço muda, notifica todos automaticamente
    public void setPreco(double novoPreco) {
        System.out.printf("%n[Ação %s] Preço atualizado: R$ %.2f -> R$ %.2f%n",
                ticker, this.preco, novoPreco);
        this.preco = novoPreco;
        notificarInvestidores();
    }

    public String getTicker() { return ticker; }
    public double getPreco()  { return preco; }
}
