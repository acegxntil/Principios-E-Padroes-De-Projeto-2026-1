package questao2.toyota;

import questao2.interfaces.IVehicle;

public class Corolla implements IVehicle {

    @Override
    public void start() {
        System.out.println("Corolla: ligando o motor");
    }

    @Override
    public void drive() {
        System.out.println("Corolla: rodando na estrada");
    }

    @Override
    public void stop() {
        System.out.println("Corolla: parando");
    }
}