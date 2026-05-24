package questao2.honda;

import questao2.interfaces.IVehicle;

public class Fit implements IVehicle {

    @Override
    public void start() {
        System.out.println("Fit: ligando");
    }

    @Override
    public void drive() {
        System.out.println("Fit: rodando pelo bairro");
    }

    @Override
    public void stop() {
        System.out.println("Fit: parando");
    }
}