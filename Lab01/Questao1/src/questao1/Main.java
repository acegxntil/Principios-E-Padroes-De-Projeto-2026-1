package questao1;

import questao1.apple.Apple;
import questao1.samsung.Samsung;
import questao1.interfaces.Celular;
import questao1.interfaces.FabricanteCelular;

public class Main {

    public static void main(String[] args) {

        // pega a instancia unica da apple (por singleton)
        FabricanteCelular apple = Apple.getInstancia();
        FabricanteCelular apple2 = Apple.getInstancia();

        // confirma que é a mesma instancia
        System.out.println("apple == apple2? " + (apple == apple2));

        // factory pede pra apple construir diferentes modelos
        Celular iPhoneX = apple.constroiCelular("IPhoneX");
        Celular iPhoneS = apple.constroiCelular("IPhoneS");

        iPhoneX.fazLigacao();
        iPhoneX.tiraFoto();

        iPhoneS.fazLigacao();
        iPhoneS.tiraFoto();

        System.out.println("---");

        // pega a instancia unica da samsung (por singleton)
        FabricanteCelular samsung = Samsung.getInstancia();

        Celular g8 = samsung.constroiCelular("Galaxy8");
        Celular g20 = samsung.constroiCelular("Galaxy20");

        g8.fazLigacao();
        g8.tiraFoto();

        g20.fazLigacao();
        g20.tiraFoto();

        // teste com um modelo que nao existe
        System.out.println("---");
        samsung.constroiCelular("Galaxy999");
    }
}