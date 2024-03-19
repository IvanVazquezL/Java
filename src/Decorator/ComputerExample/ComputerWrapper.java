package Decorator.ComputerExample;

public class ComputerWrapper implements Computer{
    private Computer computer;

    public ComputerWrapper(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String addPart() {
        return computer.addPart();
    }
}
