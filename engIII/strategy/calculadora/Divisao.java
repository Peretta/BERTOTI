public class Divisao implements Operacao {
    @Override
    public float calcular(float n1, float n2) {
        if (n2 == 0) {
            throw new ArithmeticException("Erro: Divisão por zero!");
        }
        return n1 / n2;
    }
}