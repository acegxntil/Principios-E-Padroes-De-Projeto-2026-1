package questao1;

public class Item {

    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return preco * quantidade;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }

    @Override
    public String toString() {
        return String.format("%s (x%d) - R$ %.2f", nome, quantidade, getSubtotal());
    }
}
