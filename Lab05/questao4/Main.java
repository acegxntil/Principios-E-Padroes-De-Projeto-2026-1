package questao4;

public class Main {
    public static void main(String[] args) {

        // Brokers
        AcaoBroker brokerXP    = new AcaoBroker("XP Investimentos");
        AcaoBroker brokerItau  = new AcaoBroker("Itaú Corretora");

        // Investidores com seus limites mínimo e máximo de preço
        // Investidor(nome, precoMin, precoMax, qtdAcoes, broker)
        Investidor carlos = new Investidor("Carlos",  28.00, 38.00, 100, brokerXP);
        Investidor maria  = new Investidor("Maria",   25.00, 40.00,  50, brokerItau);
        Investidor joao   = new Investidor("João",    30.00, 35.00, 200, brokerXP);

        // Ação PETR4 começa em R$ 32,00
        Acao petr4 = new Acao("PETR4", 32.00);

        // Registra investidores nessa ação
        petr4.registrarInvestidor(carlos);
        petr4.registrarInvestidor(maria);
        petr4.registrarInvestidor(joao);

        // Simula variações de mercado
        petr4.setPreco(34.50);   // normal, ninguém age
        petr4.setPreco(35.00);   // João atinge precoMax -> VENDE
        petr4.setPreco(38.00);   // Carlos atinge precoMax -> VENDE
        petr4.setPreco(24.00);   // Maria atinge precoMin -> COMPRA

        System.out.println("\n--- Removendo Carlos da lista ---");
        petr4.removerInvestidor(carlos);

        petr4.setPreco(40.00);   // Maria atinge precoMax -> VENDE (Carlos não recebe mais)
    }
}
