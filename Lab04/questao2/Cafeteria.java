package questao2;

public class Cafeteria {

    public static void main(String[] args) {

        System.out.println("===== BEM-VINDO À CAFETERIA =====\n");

        // --- Espresso puro ---
        Bebida bebida1 = new Espresso();
        System.out.println(bebida1.getDescricao());
        System.out.printf("Custo: R$ %.2f%n", bebida1.calculaCusto());

        System.out.println();

        // --- Espresso com Leite e Chocolate (Mocha) ---
        Bebida bebida2 = new Espresso();
        bebida2 = new Leite(bebida2);
        bebida2 = new Chocolate(bebida2);

        System.out.println(bebida2.getDescricao());
        System.out.printf("Custo: R$ %.2f%n", bebida2.calculaCusto());

        System.out.println();

        // --- Decaf com Canela e Caramelo ---
        Bebida bebida3 = new Decaf();
        bebida3 = new Canela(bebida3);
        bebida3 = new Caramelo(bebida3);

        System.out.println(bebida3.getDescricao());
        System.out.printf("Custo: R$ %.2f%n", bebida3.calculaCusto());

        System.out.println();

        // --- Decaf com Leite, Chocolate e Caramelo ---
        Bebida bebida4 = new Decaf();
        bebida4 = new Leite(bebida4);
        bebida4 = new Chocolate(bebida4);
        bebida4 = new Caramelo(bebida4);

        System.out.println(bebida4.getDescricao());
        System.out.printf("Custo: R$ %.2f%n", bebida4.calculaCusto());
    }
}
