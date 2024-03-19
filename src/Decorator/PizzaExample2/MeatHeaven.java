package Decorator.PizzaExample2;

public class MeatHeaven extends Pizza{
    public MeatHeaven() {
        description = "Meat Heaven";
    }
    @Override
    double cost() {
        return 4.0;
    }
}
