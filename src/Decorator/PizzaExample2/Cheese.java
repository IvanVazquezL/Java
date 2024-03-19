package Decorator.PizzaExample2;

public class Cheese extends Decorator{
    private Pizza pizza;
    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    String getDescription() {
        return pizza.getDescription() + ", cheese";
    }

    @Override
    double cost() {
        return 0.20 + pizza.cost();
    }
}
