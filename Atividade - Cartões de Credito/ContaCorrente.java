class ContaCorrente extends Conta {

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}

