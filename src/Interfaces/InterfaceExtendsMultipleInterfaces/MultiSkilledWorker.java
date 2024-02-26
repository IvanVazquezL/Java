package Interfaces.InterfaceExtendsMultipleInterfaces;

public class MultiSkilledWorker implements MultiSkilledEmployee{
    @Override
    public void code() {
        System.out.println("Writing code...");
    }

    @Override
    public void testSoftware() {
        System.out.println("Testing software...");
    }

    @Override
    public void manageTeam() {
        System.out.println("Managing team...");
    }

    @Override
    public void attendMeetings() {
        System.out.println("Attending meetings...");
    }
}
