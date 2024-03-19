package Decorator.PizzaExample;

public class PlainPizza implements Pizza{
    @Override
    public String cook() {
        return "Pizza";
    }
}
