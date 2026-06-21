package questao3;

public class Cinemateca {

    public static void main(String[] args) {

        // Cria todos os equipamentos individualmente
        Amplificador    amplificador    = new Amplificador();
        Luzes           luzes           = new Luzes();
        MaquinaDePipoca maquinaDePipoca = new MaquinaDePipoca();
        Projetor        projetor        = new Projetor();
        PlayerDeStreaming player         = new PlayerDeStreaming();
        Telao           telao           = new Telao();

        // A fachada encapsula toda a complexidade
        HomeTheaterFachada homeTheater = new HomeTheaterFachada(
                amplificador, luzes, maquinaDePipoca, projetor, player, telao
        );

        // O cliente só precisa chamar um método simples!
        homeTheater.assistirFilme("O Poderoso Chefão");

        // Ao final, outro método simples encerra tudo
        homeTheater.fimDoFilme();
    }
}
