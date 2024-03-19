package Decorator.ComputerExample;

public class SSD extends ComputerWrapper{

    public SSD(Computer computer) {
        super(computer);
    }

    @Override
    public String addPart() {
        return super.addPart() + " SSD";
    }
}
