package StaticMembers;

public class Main {
    public static void main(String[] args) {
        Person.printStatistics();

        Person person1 = new Person("Alice", 30);
        Person.printStatistics();

        Person person2 = new Person("Bob", 25);

        // Print static fields
        Person.printStatistics();

        // Create some tasks
        Task task1 = new Task("Complete assignment");
        Task task2 = new Task("Buy groceries");

        // Print the timestamp of the last created task
        Task.printLastCreated();

        MovimientoConAceleracionConstante movimiento = new MovimientoConAceleracionConstante(
               5,
               15,
               4
        );

        double sol = movimiento.ObtenerLaPosicionXEnT(2);

        System.out.println(sol);

        double velocidadEnT = movimiento.ObtenerVelocidadEnT(2);

        System.out.println(velocidadEnT);

        double x = movimiento.ObtenerXCuandoVEs(25);

        System.out.println(x);
    }
}
