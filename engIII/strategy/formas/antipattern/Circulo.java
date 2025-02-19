package antipattern;

public class Circulo extends Forma {
    public Circulo(double raio) {
        super(raio, 0); // O segundo parâmetro não faz sentido aqui!
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(medida1, 2);
    }
}
