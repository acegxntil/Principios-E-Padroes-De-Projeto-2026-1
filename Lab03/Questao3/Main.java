public class Main {
    public static void main(String[] args) {
        Reprodutor player = new BluetoothAdapter(new CaixaBluetooth());
        player.tocarMusica();
    }
}