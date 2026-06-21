package questao1;

// Decorador concreto: Queijo
class Queijo extends ToppingDecorator {

    public Queijo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", Queijo";
    }

    @Override
    public double getCusto() {
        return pizza.getCusto() + 4.50;
    }
}

// Decorador concreto: Tomate
class Tomate extends ToppingDecorator {

    public Tomate(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", Tomate";
    }

    @Override
    public double getCusto() {
        return pizza.getCusto() + 3.00;
    }
}

// Decorador concreto: Ovo
class Ovo extends ToppingDecorator {

    public Ovo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", Ovo";
    }

    @Override
    public double getCusto() {
        return pizza.getCusto() + 2.50;
    }
}

// Decorador concreto: Frango (ingrediente extra)
class Frango extends ToppingDecorator {

    public Frango(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", Frango";
    }

    @Override
    public double getCusto() {
        return pizza.getCusto() + 6.00;
    }
}
