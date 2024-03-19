package Decorator.ComputerExample;

public class ComputerParts implements Computer{

    @Override
    public String addPart() {
        return "Adding CPU, Motherboard, PowerSupply, RAM";
    }
}
