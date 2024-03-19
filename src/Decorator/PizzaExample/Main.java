package Decorator.PizzaExample;

public class Main {
    public static void main(String[] args) {
        Pizza pepperoni = new Pepperoni(new PlainPizza());
        System.out.println(pepperoni.cook());

        Pizza hotPepperoni = new HotPepper(pepperoni);
        System.out.println(hotPepperoni.cook());
    }
}
