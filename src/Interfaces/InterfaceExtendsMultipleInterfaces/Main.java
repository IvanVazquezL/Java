package Interfaces.InterfaceExtendsMultipleInterfaces;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the MultiSkilledWorker class
        MultiSkilledEmployee employee = new MultiSkilledWorker();

        // Use the different skills of the employee
        employee.code();
        employee.testSoftware();
        employee.manageTeam();
        employee.attendMeetings();
    }
}
