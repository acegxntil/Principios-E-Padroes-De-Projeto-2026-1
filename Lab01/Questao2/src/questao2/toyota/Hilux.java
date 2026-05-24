package questao2.toyota;

import questao2.interfaces.IVehicle;

public class Hilux implements IVehicle {

    @Override
    public void start() {
        System.out.println("Hilux: ligando o motor diesel");
    }

    @Override
    public void drive() {
        System.out.println("Hilux: rodando em qualquer terreno");
    }

    @Override
    public void stop() {
        System.out.println("Hilux: parando");
    }
}