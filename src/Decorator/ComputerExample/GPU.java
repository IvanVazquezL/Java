package Decorator.ComputerExample;

public class GPU extends ComputerWrapper{
    public GPU(Computer computer) {
        super(computer);
    }

    @Override
    public String addPart() {
        return super.addPart() + " GPU";
    }
}
