package Decorator.PizzaExample2;

public class Vegan extends Pizza{
    public Vegan() {
        description = "Vegan";
    }

    @Override
    double cost() {
        return 4.99;
    }
}
