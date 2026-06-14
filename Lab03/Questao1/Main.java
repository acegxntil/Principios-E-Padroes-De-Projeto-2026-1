public class Main {

    public static void main(String[] args) {

        Ave pato = new PatoDomestico();

        System.out.println("=== PATO ===");
        pato.voar();
        pato.emitirSom();

        Ave pavao = new PavaoAdapter(new PavaoAzul());

        System.out.println("\n=== PAVÃO ===");
        pavao.voar();
        pavao.emitirSom();
    }
}