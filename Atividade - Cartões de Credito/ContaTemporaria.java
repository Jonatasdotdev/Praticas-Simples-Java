class ContaTemporaria extends Conta {

    public ContaTemporaria(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            if (saldo == 0) {
                desativarConta();
            }
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    private void desativarConta() {
        System.out.println("Conta desativada.");
    }
}