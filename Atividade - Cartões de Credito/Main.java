public class Main {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente(500);
        Cartao t1 = new CartaoDebito();
        t1.setConta(c1);
        t1.sacar(50);
        System.out.println("Saldo da conta c1: " + c1.getSaldo());

        Conta c2 = new ContaCorrente(100);
        Cartao t2 = new CartaoCredito(500);
        t2.setConta(c2);
        t2.sacar(50);
        System.out.println("Limite do cartão t2: " + ((CartaoCredito) t2).getLimite());

        Conta c3 = new ContaTemporaria(100);
        Cartao t3 = new CartaoPrePago();
        t3.setConta(c3);
        t3.sacar(100);
        System.out.println("Saldo da conta c3: " + c3.getSaldo());
    }
}