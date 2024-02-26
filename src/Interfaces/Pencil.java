package Interfaces;

public class Pencil implements DrawingTool{
    @Override
    public void draw(Curve curve) {
        System.out.println("-----");
    }
}
