package questao1.apple;

import questao1.interfaces.Celular;

public class IPhoneS implements Celular {

    @Override
    public void fazLigacao() {
        System.out.println("IPhone S: fazendo ligacao");
    }

    @Override
    public void tiraFoto() {
        System.out.println("IPhone S: tirando foto");
    }
}