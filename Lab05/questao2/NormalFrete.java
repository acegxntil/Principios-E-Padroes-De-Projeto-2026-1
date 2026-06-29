package questao2;

public class NormalFrete implements FreteStrategy {

    // Normal (PAC): taxa fixa menor + R$1,50 por kg
    private static final double TAXA_FIXA = 8.00;
    private static final double TAXA_POR_KG = 1.50;

    @Override
    public double calcularFrete(double pesoKg) {
        return TAXA_FIXA + (pesoKg * TAXA_POR_KG);
    }

    @Override
    public String getNome() {
        return "Normal/PAC (entrega em até 10 dias úteis)";
    }
}
