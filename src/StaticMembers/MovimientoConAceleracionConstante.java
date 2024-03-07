package StaticMembers;

public class MovimientoConAceleracionConstante {
    private double posicionInicial;
    private double velocidadInicial;
    private double aceleracionConstante;
    MovimientoConAceleracionConstante(
        double posicionInicial,
        double velocidadInicial,
        double aceleracionConstante
    ) {
        this.posicionInicial = posicionInicial;
        this.velocidadInicial = velocidadInicial;
        this.aceleracionConstante = aceleracionConstante;
    }
    public double ObtenerLaPosicionXEnT(double tiempo) {
        return posicionInicial + (velocidadInicial * tiempo) +
                0.5 * aceleracionConstante * Math.pow(tiempo,2);
    }

    public double ObtenerVelocidadEnT(double tiempo) {
        return velocidadInicial + aceleracionConstante * tiempo;
    }

    public double ObtenerXCuandoVEs(double velocidadEnX) {
        return posicionInicial +
                ((Math.pow(velocidadEnX,2) - Math.pow(velocidadInicial,2)) /
                        (2 * aceleracionConstante));
    }
}
