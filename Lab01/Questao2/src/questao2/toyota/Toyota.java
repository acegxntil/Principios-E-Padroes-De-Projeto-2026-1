package questao2.toyota;

import questao2.interfaces.IVehicle;
import questao2.interfaces.IVehicleMaker;

public class Toyota implements IVehicleMaker {

    private static Toyota instancia;

    private Toyota() {}

    public static Toyota getInstancia() {
        if (instancia == null) {
            instancia = new Toyota();
        }
        return instancia;
    }

    @Override
    public IVehicle makeVehicle(String modelo) {
        if (modelo.equalsIgnoreCase("Corolla")) {
            return new Corolla();
        } else if (modelo.equalsIgnoreCase("Hilux")) {
            return new Hilux();
        } else if (modelo.equalsIgnoreCase("Etios")) {
            return new Etios();
        } else {
            System.out.println("toyota nao fabrica o modelo: " + modelo);
            return null;
        }
    }
}