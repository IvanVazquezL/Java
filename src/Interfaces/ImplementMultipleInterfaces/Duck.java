package Interfaces.ImplementMultipleInterfaces;

public class Duck implements Swimmer, Flyer, Runner{
    @Override
    public void fly() {
        System.out.println("The duck is flying");
    }

    @Override
    public void run() {
        System.out.println("The duck is running");

    }

    @Override
    public void swim() {
        System.out.println("The duck is swimming");
    }
}
