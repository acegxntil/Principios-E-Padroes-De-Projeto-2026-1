package questao1.samsung;

import questao1.interfaces.Celular;

public class Galaxy20 implements Celular {

    @Override
    public void fazLigacao() {
        System.out.println("Galaxy 20: fazendo ligacao");
    }

    @Override
    public void tiraFoto() {
        System.out.println("Galaxy 20: tirando foto com zoom espacial");
    }
}