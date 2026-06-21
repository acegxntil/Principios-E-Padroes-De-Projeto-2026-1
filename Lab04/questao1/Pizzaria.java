package questao1;

public class Pizzaria {

    public static void main(String[] args) {

        System.out.println("===== BEM-VINDO À PIZZARIA =====\n");

        // --- Pizza Marguerita: massa fina + queijo + tomate ---
        Pizza marguerita = new MassaFinaPizza();
        marguerita = new Queijo(marguerita);
        marguerita = new Tomate(marguerita);

        System.out.println("Pizza Marguerita");
        System.out.println("Ingredientes: " + marguerita.getDescricao());
        System.out.printf("Custo: R$ %.2f%n", marguerita.getCusto());

        System.out.println();

        // --- Pizza Portuguesa: massa espessa + queijo + ovo + tomate ---
        Pizza portuguesa = new MassaEspessaPizza();
        portuguesa = new Queijo(portuguesa);
        portuguesa = new Ovo(portuguesa);
        portuguesa = new Tomate(portuguesa);

        System.out.println("Pizza Portuguesa");
        System.out.println("Ingredientes: " + portuguesa.getDescricao());
        System.out.printf("Custo: R$ %.2f%n", portuguesa.getCusto());

        System.out.println();

        // --- Pizza Frango com Queijo (ingrediente extra): massa fina + frango + queijo ---
        Pizza frangoQueijo = new MassaFinaPizza();
        frangoQueijo = new Frango(frangoQueijo);
        frangoQueijo = new Queijo(frangoQueijo);

        System.out.println("Pizza Frango com Queijo");
        System.out.println("Ingredientes: " + frangoQueijo.getDescricao());
        System.out.printf("Custo: R$ %.2f%n", frangoQueijo.getCusto());
    }
}
