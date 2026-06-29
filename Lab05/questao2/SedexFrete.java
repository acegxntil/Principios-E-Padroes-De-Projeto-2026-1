package questao2;

public class SedexFrete implements FreteStrategy {

    // Sedex: taxa fixa + R$3,50 por kg
    private static final double TAXA_FIXA = 15.00;
    private static final double TAXA_POR_KG = 3.50;

    @Override
    public double calcularFrete(double pesoKg) {
        return TAXA_FIXA + (pesoKg * TAXA_POR_KG);
    }

    @Override
    public String getNome() {
        return "SEDEX (entrega em até 2 dias úteis)";
    }
}
