package questao1;

// Objeto base concreto: massa fina
public class MassaFinaPizza implements Pizza {

    @Override
    public String getDescricao() {
        return "Pizza de Massa Fina";
    }

    @Override
    public double getCusto() {
        return 20.00;
    }
}
