package questao2.toyota;

import questao2.interfaces.IVehicle;

public class Etios implements IVehicle {

    @Override
    public void start() {
        System.out.println("Etios: ligando");
    }

    @Override
    public void drive() {
        System.out.println("Etios: rodando pela cidade");
    }

    @Override
    public void stop() {
        System.out.println("Etios: parando");
    }
}