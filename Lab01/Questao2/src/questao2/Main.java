package questao2;

import questao2.honda.Honda;
import questao2.toyota.Toyota;
import questao2.interfaces.IVehicle;
import questao2.interfaces.IVehicleMaker;

public class Main {

    public static void main(String[] args) {

        // singleton pega a unica instancia da toyota
        IVehicleMaker toyota = Toyota.getInstancia();
        IVehicleMaker toyota2 = Toyota.getInstancia();

        // verifica que as duas referencias apontam pro mesmo objeto
        System.out.println("Mesma instancia Toyota? " + (toyota == toyota2));

        // factory - toyota decide internamente qual classe instanciar
        IVehicle corolla = toyota.makeVehicle("Corolla");
        corolla.start();
        corolla.drive();
        corolla.stop();

        System.out.println("---");

        IVehicle hilux = toyota.makeVehicle("Hilux");
        hilux.start();
        hilux.drive();
        hilux.stop();

        System.out.println("---");

        IVehicle etios = toyota.makeVehicle("Etios");
        etios.start();
        etios.drive();
        etios.stop();

        System.out.println("===");

        // singleton - instancia unica da honda
        IVehicleMaker honda = Honda.getInstancia();

        IVehicle civic = honda.makeVehicle("Civic");
        civic.start();
        civic.drive();
        civic.stop();

        System.out.println("---");

        IVehicle fit = honda.makeVehicle("Fit");
        fit.start();
        fit.drive();
        fit.stop();

        System.out.println("---");

        // modelo que nao existe pra testar o tratamento
        honda.makeVehicle("HRV");
    }
}