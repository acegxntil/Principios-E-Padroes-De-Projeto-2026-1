package questao3;

// Cada classe representa um equipamento real da cinemateca

class Amplificador {
    public void liga() {
        System.out.println("Amplificador: ligado.");
    }
    public void ajustaVolume(int volume) {
        System.out.println("Amplificador: volume ajustado para " + volume + ".");
    }
    public void desliga() {
        System.out.println("Amplificador: desligado.");
    }
}

class Luzes {
    public void liga() {
        System.out.println("Luzes: ligadas.");
    }
    public void desliga() {
        System.out.println("Luzes: apagadas.");
    }
}

class MaquinaDePipoca {
    public void liga() {
        System.out.println("Máquina de Pipoca: ligada.");
    }
    public void arrebentaPipoca() {
        System.out.println("Máquina de Pipoca: fazendo pipoca...");
    }
    public void desliga() {
        System.out.println("Máquina de Pipoca: desligada.");
    }
}

class Projetor {
    public void liga() {
        System.out.println("Projetor: ligado.");
    }
    public void desliga() {
        System.out.println("Projetor: desligado.");
    }
}

class PlayerDeStreaming {
    public void liga() {
        System.out.println("Player de Streaming: ligado.");
    }
    public void play(String filme) {
        System.out.println("Player de Streaming: reproduzindo \"" + filme + "\".");
    }
    public void desliga() {
        System.out.println("Player de Streaming: desligado.");
    }
}

class Telao {
    public void abaixa() {
        System.out.println("Telão: abaixado.");
    }
    public void sobe() {
        System.out.println("Telão: recolhido.");
    }
}
