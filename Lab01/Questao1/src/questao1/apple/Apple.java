package questao1.apple;

import questao1.interfaces.Celular;
import questao1.interfaces.FabricanteCelular;

// singleton - só existe uma instância da apple como fabricante
public class Apple implements FabricanteCelular {

    private static Apple instancia;

    // construtor privado impede criação via new
    private Apple() {}

    public static Apple getInstancia() {
        if (instancia == null) {
            instancia = new Apple();
        }
        return instancia;
    }

    // factory decide qual modelo construir com base no parametro
    @Override
    public Celular constroiCelular(String modelo) {
        if (modelo.equalsIgnoreCase("IPhoneX")) {
            return new IPhoneX();
        } else if (modelo.equalsIgnoreCase("IPhoneS")) {
            return new IPhoneS();
        } else {
            System.out.println("modelo " + modelo + " nao fabricado pela apple.");
            return null;
        }
    }
}