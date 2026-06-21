package questao1;

// Objeto base concreto: massa espessa
public class MassaEspessaPizza implements Pizza {

    @Override
    public String getDescricao() {
        return "Pizza de Massa Espessa";
    }

    @Override
    public double getCusto() {
        return 25.00;
    }
}
