abstract class Cartao {
    protected Conta contaAssociada;

    public void setConta(Conta conta) {
        this.contaAssociada = conta;
    }

    public abstract void sacar(double valor);
}
