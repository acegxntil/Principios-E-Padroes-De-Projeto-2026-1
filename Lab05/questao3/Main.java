package questao3;

public class Main {
    public static void main(String[] args) {

        // Subject
        CentralEstacaoTempo cet = new CentralEstacaoTempo();

        // Observers
        PrefeituraUberlandia prefeitura = new PrefeituraUberlandia();
        AeroportoUberlandia aeroporto  = new AeroportoUberlandia();

        // Registra quem quer receber notificações
        cet.registrarObserver(prefeitura);
        cet.registrarObserver(aeroporto);

        // Simula chegada de dados (dia normal)
        cet.setMedicoes(28.5, 55.0, 20.0);

        // Simula dia seco e com vento
        cet.setMedicoes(35.0, 15.0, 55.0);

        // Remove o aeroporto e envia nova leitura
        System.out.println();
        cet.removerObserver(aeroporto);
        cet.setMedicoes(32.0, 18.0, 90.0); // só prefeitura receberá
    }
}
