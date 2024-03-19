package Decorator.PizzaExample2;

public class Tomato extends Decorator{
    private Pizza pizza;

    public Tomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", tomato";
    }

    @Override
    double cost() {
        return 0.09 + pizza.cost();
    }
}
