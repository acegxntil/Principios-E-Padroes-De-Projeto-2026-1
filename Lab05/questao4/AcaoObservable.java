package questao4;

public interface AcaoObservable {
    void registrarInvestidor(InvestidorObserver investidor);
    void removerInvestidor(InvestidorObserver investidor);
    void notificarInvestidores();
}
