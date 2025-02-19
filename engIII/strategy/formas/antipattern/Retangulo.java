package antipattern;

public class Retangulo extends Forma {
    public Retangulo(double largura, double altura) {
        super(largura, altura);
    }

    @Override
    public double calcularArea() {
        return medida1 * medida2;
    }
}
