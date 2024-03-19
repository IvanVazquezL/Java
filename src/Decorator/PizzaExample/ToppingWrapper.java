package Decorator.PizzaExample;

public class ToppingWrapper implements Pizza{
    private Pizza pizza;

    public ToppingWrapper(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String cook() {
        return pizza.cook();
    }
}
