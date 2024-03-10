package StaticMembers;

public class CircuitoElectrico {
    private double resistencia;
    private double corriente;
    private double voltaje;

    public CircuitoElectrico(double resistencia) {
        this.resistencia = resistencia;
    }

    public void calcularCorriente(double voltaje) {
        this.voltaje = voltaje;
        this.corriente = voltaje / resistencia;
    }

    public void calcularVoltaje(double corriente) {
        this.corriente = corriente;
        this.voltaje = corriente * resistencia;
    }

    public static void main(String[] args) {
        CircuitoElectrico circuito = new CircuitoElectrico(10); // Resistencia de 10 ohmios
        double voltaje = 50; // Voltaje de la fuente de alimentación

        circuito.calcularCorriente(voltaje);
        System.out.println("Corriente en el circuito: " + circuito.getCorriente() + " amperios");

        double corriente = 2; // Corriente en el circuito
        circuito.calcularVoltaje(corriente);
        System.out.println("Voltaje en el circuito: " + circuito.getVoltaje() + " voltios");
    }

    // Getters para los campos privados
    public double getResistencia() {
        return resistencia;
    }

    public double getCorriente() {
        return corriente;
    }

    public double getVoltaje() {
        return voltaje;
    }
}
