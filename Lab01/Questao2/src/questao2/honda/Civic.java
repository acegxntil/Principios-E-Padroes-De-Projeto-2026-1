package questao2.honda;

import questao2.interfaces.IVehicle;

public class Civic implements IVehicle {

    @Override
    public void start() {
        System.out.println("Civic: ligando o motor turbo");
    }

    @Override
    public void drive() {
        System.out.println("Civic: acelerando na pista");
    }

    @Override
    public void stop() {
        System.out.println("Civic: parando");
    }
}