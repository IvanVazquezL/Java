package Decorator.ComputerExample;

public class Main {
    public static void main(String[] args) {
        Computer computer = new GPU(new SSD(new ComputerParts()));
        System.out.println(computer.addPart());
    }
}
