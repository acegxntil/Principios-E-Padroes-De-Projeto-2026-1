package questao3;

// A Prefeitura só se interessa pela UMIDADE para emitir alertas da defesa civil
public class PrefeituraUberlandia implements Observer {

    private static final double LIMITE_UMIDADE_CRITICA = 20.0;

    @Override
    public void atualizar(double temperatura, double umidade, double velocidadeVento) {
        System.out.println("[Prefeitura de Uberlândia] Umidade recebida: " + umidade + "%");

        if (umidade < LIMITE_UMIDADE_CRITICA) {
            System.out.println("  ⚠️  ALERTA DEFESA CIVIL: Umidade relativa do ar CRÍTICA (" + umidade + "%)!");
            System.out.println("       Recomendação: evite exposição ao sol e mantenha-se hidratado.");
        } else {
            System.out.println("  ✅ Umidade dentro dos parâmetros normais. Sem alertas.");
        }
    }
}
