package questao1.apple;

import questao1.interfaces.Celular;

public class IPhoneX implements Celular {

    @Override
    public void fazLigacao() {
        System.out.println("IPhone X: fazendo ligacao");
    }

    @Override
    public void tiraFoto() {
        System.out.println("IPhone X: tirando foto com camera dupla");
    }
}