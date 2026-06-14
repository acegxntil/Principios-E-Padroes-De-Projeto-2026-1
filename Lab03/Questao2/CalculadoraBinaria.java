public class CalculadoraBinaria {
    public String somar(String a, String b) {

        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);

        return Integer.toBinaryString(num1 + num2);
    }
    public String subtrair(String a, String b) {

        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);

        return Integer.toBinaryString(num1 - num2);
    }
}