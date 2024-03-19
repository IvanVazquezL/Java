package Decorator.PizzaExample2;

public class Broccoli extends Decorator{
    private Pizza pizza;

    public Broccoli(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", broccoli";
    }

    @Override
    double cost() {
        return 0.10 + pizza.cost();
    }
}
