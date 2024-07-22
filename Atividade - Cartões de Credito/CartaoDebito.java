class CartaoDebito extends Cartao {

    @Override
    public void sacar(double valor) {
        if (contaAssociada != null) {
            contaAssociada.sacar(valor);
        } else {
            System.out.println("Nenhuma conta associada.");
        }
    }
}

