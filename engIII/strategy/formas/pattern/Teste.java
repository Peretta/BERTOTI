public class Teste {
    public static void main(String[] args) {
        Forma circulo = new Circulo(5);
        Forma retangulo = new Retangulo(4, 6);

        CalculadoraDeForma calculadora = new CalculadoraDeForma(circulo);
        System.out.println("Área do Círculo: " + calculadora.calcular());

        calculadora.setForma(retangulo);
        System.out.println("Área do Retângulo: " + calculadora.calcular());
    }
}
    