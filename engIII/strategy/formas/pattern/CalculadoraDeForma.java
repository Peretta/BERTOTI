public class CalculadoraDeForma {
    private Forma forma;

    public CalculadoraDeForma(Forma forma) {
        this.forma = forma;
    }

    public double calcular() {
        return forma.calcularArea();
    }

    public void setForma(Forma forma) {
        this.forma = forma;
    }
}
