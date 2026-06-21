package questao2;

// Objeto base concreto: Espresso
public class Espresso implements Bebida {

    @Override
    public String getDescricao() {
        return "Espresso";
    }

    @Override
    public double calculaCusto() {
        return 5.00;
    }
}
