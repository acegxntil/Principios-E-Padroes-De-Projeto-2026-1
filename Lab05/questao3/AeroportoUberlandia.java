package questao3;

// O Aeroporto só se interessa pela VELOCIDADE DO VENTO
public class AeroportoUberlandia implements Observer {

    private static final double LIMITE_VENTO_ATENCAO = 50.0;
    private static final double LIMITE_VENTO_PERIGO  = 80.0;

    @Override
    public void atualizar(double temperatura, double umidade, double velocidadeVento) {
        System.out.println("[Aeroporto de Uberlândia] Vento recebido: " + velocidadeVento + " km/h");

        if (velocidadeVento >= LIMITE_VENTO_PERIGO) {
            System.out.println("  🔴 ALERTA VERMELHO: Vento muito forte! Operações aéreas SUSPENSAS.");
        } else if (velocidadeVento >= LIMITE_VENTO_ATENCAO) {
            System.out.println("  🟡 ATENÇÃO: Rajadas moderadas. Pilotos em alerta.");
        } else {
            System.out.println("  ✅ Condições de vento favoráveis para voos.");
        }
    }
}
