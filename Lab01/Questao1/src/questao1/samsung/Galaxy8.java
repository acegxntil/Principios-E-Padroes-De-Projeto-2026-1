package questao1.samsung;

import questao1.interfaces.Celular;

public class Galaxy8 implements Celular {

    @Override
    public void fazLigacao() {
        System.out.println("Galaxy 8: fazendo ligacao");
    }

    @Override
    public void tiraFoto() {
        System.out.println("Galaxy 8: tirando foto");
    }
}