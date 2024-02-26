package Interfaces.ClassExtendsClassAndImplementsMultipleInterfaces;

public class Car extends Vehicle implements Driveable, Parkable{
    @Override
    public void drive() {
        System.out.println("Driving the car...");
    }

    @Override
    public void park() {
        System.out.println("Parking the car...");

    }
}
