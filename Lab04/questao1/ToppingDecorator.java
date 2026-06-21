package questao1;

// Decorator abstrato — mantém referência para o objeto Pizza decorado
public abstract class ToppingDecorator implements Pizza {

    // A pizza que está sendo decorada
    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    // As subclasses concretas vão sobrescrever esses métodos
    @Override
    public abstract String getDescricao();

    @Override
    public abstract double getCusto();
}
