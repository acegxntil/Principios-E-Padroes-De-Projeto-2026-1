package questao2.honda;

import questao2.interfaces.IVehicle;
import questao2.interfaces.IVehicleMaker;

public class Honda implements IVehicleMaker {

    private static Honda instancia;

    private Honda() {}

    public static Honda getInstancia() {
        if (instancia == null) {
            instancia = new Honda();
        }
        return instancia;
    }

    @Override
    public IVehicle makeVehicle(String modelo) {
        if (modelo.equalsIgnoreCase("City")) {
            return new City();
        } else if (modelo.equalsIgnoreCase("Civic")) {
            return new Civic();
        } else if (modelo.equalsIgnoreCase("Fit")) {
            return new Fit();
        } else {
            System.out.println("honda nao fabrica o modelo: " + modelo);
            return null;
        }
    }
}