package Decorator.PizzaExample2;

abstract class Pizza {
    String description;

    String getDescription() {
        return description;
    }

    abstract double cost();
}
