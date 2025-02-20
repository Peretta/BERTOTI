
public class teste {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        
        // SOMANDO

        calculadora.setOperacao(new Adicao());
        float resultado = calculadora.executarCalculo(2.2f, 3.2f);
        System.out.println("RESULTADO DA SOMA: "+ resultado);

        // MULTIPLICANDO

        calculadora.setOperacao(new Multiplicacao());
        resultado = calculadora.executarCalculo(40.2f, 2.0f);
        System.out.println("RESULTADO DA MULTIPLICAÇÃO "+ resultado);

        // SUBTRAINDO

        calculadora.setOperacao(new Subtracao());
        resultado = calculadora.executarCalculo(22.2f, 2.2f);
        System.out.println("RESULTADO DA SUBTRAÇÃO "+ resultado);

        // DIVIDINDO

        calculadora.setOperacao(new Divisao());
        resultado = calculadora.executarCalculo(40.2f, 2.0f);
        System.out.println("RESULTADO DA DIVISÃO "+ resultado);

    }
}
