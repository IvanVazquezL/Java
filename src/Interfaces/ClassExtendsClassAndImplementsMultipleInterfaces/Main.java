package Interfaces.ClassExtendsClassAndImplementsMultipleInterfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        // Call methods from the Vehicle class and interfaces Driveable and Parkable
        car.start();
        car.drive();
        car.park();
    }
}
