package questao2;

// Decorator abstrato da cafeteria
public abstract class CondimentoDecorator implements Bebida {

    protected Bebida bebida;

    public CondimentoDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public abstract String getDescricao();

    @Override
    public abstract double calculaCusto();
}
