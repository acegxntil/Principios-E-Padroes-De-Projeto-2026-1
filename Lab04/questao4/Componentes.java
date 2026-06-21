package questao4;

// Cada classe representa um componente real do carro

class Motor {
    public void liga() {
        System.out.println("Motor: ligado.");
    }
    public void desliga() {
        System.out.println("Motor: desligado.");
    }
}

class CintoDeSeguranca {
    public void trava() {
        System.out.println("Cinto de Segurança: travado.");
    }
    public void destrava() {
        System.out.println("Cinto de Segurança: destravado.");
    }
}

class Porta {
    public void tranca() {
        System.out.println("Portas: trancadas.");
    }
    public void destrana() {
        System.out.println("Portas: destrancadas.");
    }
}

class Farol {
    public void acende() {
        System.out.println("Farol: aceso.");
    }
    public void apaga() {
        System.out.println("Farol: apagado.");
    }
}

class Radio {
    public void liga() {
        System.out.println("Rádio: ligado.");
    }
    public void sintoniza(String estacao) {
        System.out.println("Rádio: sintonizado em " + estacao + ".");
    }
    public void desliga() {
        System.out.println("Rádio: desligado.");
    }
}
