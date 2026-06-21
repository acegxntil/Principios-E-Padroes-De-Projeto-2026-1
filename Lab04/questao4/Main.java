package questao4;

public class Main {

    public static void main(String[] args) {

        // O motorista só conhece a fachada
        CarroFachada carro = new CarroFachada("Rádio Transamérica FM");

        // Inicia a corrida com um único método
        carro.iniciarCorrida();

        // Simula o fim da corrida
        carro.finalizarCorrida();
    }
}
