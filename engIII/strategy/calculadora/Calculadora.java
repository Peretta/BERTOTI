public class Calculadora {
    private Operacao operacao;

    public void setOperacao(Operacao operacao){
        this.operacao = operacao;
    }
    /**
     * @return
     */
    public float executarCalculo(float n1, float n2){
        if (operacao == null){
            throw new IllegalStateException("Nenhuma operação foi selecionada!");
        }
        return operacao.calcular(n1, n2);
    }
}