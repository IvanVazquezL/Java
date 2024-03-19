package Decorator.PizzaExample;

public class Pepperoni extends ToppingWrapper{
    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String cook() {
        return super.cook() + " Pepperoni";
    }
}
