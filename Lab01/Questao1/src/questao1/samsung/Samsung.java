package questao1.samsung;

import questao1.interfaces.Celular;
import questao1.interfaces.FabricanteCelular;

// singleton garante que existe apenas uma instância da samsung
public class Samsung implements FabricanteCelular {

    private static Samsung instancia;

    private Samsung() {}

    public static Samsung getInstancia() {
        if (instancia == null) {
            instancia = new Samsung();
        }
        return instancia;
    }

    // factory cria o celular certo de acordo com o modelo pedido
    @Override
    public Celular constroiCelular(String modelo) {
        if (modelo.equalsIgnoreCase("Galaxy8")) {
            return new Galaxy8();
        } else if (modelo.equalsIgnoreCase("Galaxy20")) {
            return new Galaxy20();
        } else {
            System.out.println("modelo " + modelo + " nao fabricado pela samsung.");
            return null;
        }
    }
}