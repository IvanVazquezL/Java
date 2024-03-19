package Decorator.PizzaExample;

public class HotPepper extends ToppingWrapper{

    public HotPepper(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String cook() {
        return super.cook() + " Hot Pepper";
    }
}
