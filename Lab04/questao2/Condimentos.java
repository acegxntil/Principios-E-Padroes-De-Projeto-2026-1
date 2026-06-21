package questao2;

// Decorador concreto: Leite
class Leite extends CondimentoDecorator {

    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Leite";
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 1.50;
    }
}

// Decorador concreto: Canela
class Canela extends CondimentoDecorator {

    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Canela";
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 0.75;
    }
}

// Decorador concreto: Chocolate
class Chocolate extends CondimentoDecorator {

    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Chocolate";
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 2.00;
    }
}

// Decorador concreto: Caramelo (condimento extra)
class Caramelo extends CondimentoDecorator {

    public Caramelo(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Caramelo";
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 1.75;
    }
}
