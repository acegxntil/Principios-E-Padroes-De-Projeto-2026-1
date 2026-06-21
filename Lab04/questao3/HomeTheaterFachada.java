package questao3;

// Fachada: simplifica a interface complexa de todos os equipamentos
// O cliente precisa chamar apenas um método em vez de coordenar 6 objetos
public class HomeTheaterFachada {

    private Amplificador amplificador;
    private Luzes luzes;
    private MaquinaDePipoca maquinaDePipoca;
    private Projetor projetor;
    private PlayerDeStreaming player;
    private Telao telao;

    public HomeTheaterFachada(Amplificador amplificador,
                               Luzes luzes,
                               MaquinaDePipoca maquinaDePipoca,
                               Projetor projetor,
                               PlayerDeStreaming player,
                               Telao telao) {
        this.amplificador    = amplificador;
        this.luzes           = luzes;
        this.maquinaDePipoca = maquinaDePipoca;
        this.projetor        = projetor;
        this.player          = player;
        this.telao           = telao;
    }

    // Método que automatiza todo o ritual de início do filme
    public void assistirFilme(String filme) {
        System.out.println("=== Preparando tudo para assistir ao filme... ===");
        maquinaDePipoca.liga();
        maquinaDePipoca.arrebentaPipoca();
        luzes.desliga();
        telao.abaixa();
        projetor.liga();
        amplificador.liga();
        amplificador.ajustaVolume(10);
        player.liga();
        player.play(filme);
        System.out.println("=== Aproveite o filme! ===\n");
    }

    // Método proposto: encerra tudo ao fim do filme
    public void fimDoFilme() {
        System.out.println("=== Encerrando a sessão... ===");
        player.desliga();
        projetor.desliga();
        amplificador.desliga();
        telao.sobe();
        luzes.liga();
        maquinaDePipoca.desliga();
        System.out.println("=== Até a próxima sessão! ===\n");
    }
}
