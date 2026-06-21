package questao4;

// Fachada: o motorista interage somente com essa classe,
// sem precisar conhecer todos os componentes do carro
public class CarroFachada {

    private Motor           motor;
    private CintoDeSeguranca cinto;
    private Porta           porta;
    private Farol           farol;
    private Radio           radio;

    // Estação favorita do motorista
    private String estacaoFavorita;

    public CarroFachada(String estacaoFavorita) {
        this.motor            = new Motor();
        this.cinto            = new CintoDeSeguranca();
        this.porta            = new Porta();
        this.farol            = new Farol();
        this.radio            = new Radio();
        this.estacaoFavorita  = estacaoFavorita;
    }

    // Inicia a corrida: executa tudo em sequência
    public void iniciarCorrida() {
        System.out.println("=== Iniciando o carro... ===");
        motor.liga();
        porta.tranca();
        cinto.trava();
        farol.acende();
        radio.liga();
        radio.sintoniza(estacaoFavorita);
        System.out.println("=== Boa viagem! ===\n");
    }

    // Finaliza a corrida e desliga tudo
    public void finalizarCorrida() {
        System.out.println("=== Encerrando a corrida... ===");
        motor.desliga();
        porta.destrana();
        cinto.destrava();
        farol.apaga();
        radio.desliga();
        System.out.println("=== Carro desligado. ===\n");
    }
}
