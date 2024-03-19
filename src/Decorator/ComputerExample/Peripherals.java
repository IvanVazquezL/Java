package Decorator.ComputerExample;

public class Peripherals extends ComputerWrapper{
    public Peripherals(Computer computer) {
        super(computer);
    }

    @Override
    public String addPart() {
        return super.addPart() + " Mouse and keyboard";
    }
}
