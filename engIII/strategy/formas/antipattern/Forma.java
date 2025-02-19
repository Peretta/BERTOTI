package antipattern;

public class Forma {
    protected double medida1;
    protected double medida2;

    public Forma(double medida1, double medida2) {
        this.medida1 = medida1;
        this.medida2 = medida2;
    }

    public double calcularArea() {
        System.out.println("Método genérico, sem lógica específica!");
        return 0;
    }
}
