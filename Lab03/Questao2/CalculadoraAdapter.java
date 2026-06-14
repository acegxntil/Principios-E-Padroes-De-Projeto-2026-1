public class CalculadoraAdapter implements Calculadora {

    private CalculadoraBinaria calculadoraBinaria;

    public CalculadoraAdapter() {
        calculadoraBinaria = new CalculadoraBinaria();
    }

    @Override
    public int somar(int a, int b) {

        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);

        String resultado = calculadoraBinaria.somar(binA, binB);

        return Integer.parseInt(resultado, 2);
    }

    @Override
    public int subtrair(int a, int b) {

        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);

        String resultado = calculadoraBinaria.subtrair(binA, binB);

        return Integer.parseInt(resultado, 2);
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }
}