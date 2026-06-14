public class BluetoothAdapter implements Reprodutor {

    private CaixaBluetooth caixa;

    public BluetoothAdapter(CaixaBluetooth caixa) {
        this.caixa = caixa;
    }

    @Override
    public void tocarMusica() {
        caixa.reproduzirAudio();
    }
}