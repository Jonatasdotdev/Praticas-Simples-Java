import java.util.Scanner;

public class Maincontaclienteternario {
    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);
        System.out.print("Digite o numero da conta ");
        int numerodaconta = le.nextInt();
        System.out.print("Digite o saldo atual ");
        int saldo = le.nextInt();
        System.out.print("Digite o débito ");
        int debito = le.nextInt();
        System.out.print("Digite o credito ");
        int credito = le.nextInt();

        double saldoatual = saldo - debito + credito;
        System.out.print("Seu saldo atual é " + saldoatual);
        System.out.println("\nSeu numero da conta é " + numerodaconta);

        String mensagemSaldo = (saldoatual >= 0) ? "Seu saldo é positivo" : "Seu saldo é negativo";
        System.out.println(mensagemSaldo);
    }
}
