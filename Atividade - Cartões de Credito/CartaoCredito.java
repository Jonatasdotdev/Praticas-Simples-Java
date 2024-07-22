class CartaoCredito extends Cartao {
    private double limite;

    public CartaoCredito(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= limite) {
            limite -= valor;
        } else {
            System.out.println("Limite insuficiente.");
        }
    }

    public double getLimite() {
        return limite;
    }
}
