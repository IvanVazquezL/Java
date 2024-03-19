package Decorator.PizzaExample2;

public class Spinach extends Decorator{
    private Pizza pizza;

    public Spinach(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", spinach";
    }

    @Override
    double cost() {
        return 0.09 + pizza.cost();
    }
}
