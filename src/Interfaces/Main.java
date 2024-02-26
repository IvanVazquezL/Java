package Interfaces;

public class Main {
    public static void main(String[] args) {
        DrawingTool pencil = new Pencil();
        DrawingTool brush = new Brush();
        Curve curve = new Curve();

        drawCurve(pencil, curve);
        drawCurve(brush, curve);

        Interface instance = new Class();

        instance.instanceMethod1(); // it prints "Class: instance method1"
        instance.instanceMethod2(); // it prints "Class: instance method2"
        instance.defaultMethod();

    }

    public static void drawCurve(DrawingTool tool, Curve curve) {
        System.out.println("Drawing a curve " + curve + " using a " + tool);
        tool.draw(curve);
    }
}
