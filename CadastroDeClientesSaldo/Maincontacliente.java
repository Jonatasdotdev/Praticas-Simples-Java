import java.util.Scanner;

public class Maincontacliente {
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
        System.out.println("\n seu numero da conta é " + numerodaconta);
        if (saldoatual >= 0) {
            System.out.println("Seu saldo é positivo");

        } else {
            System.out.print("Seu saldo é negativo");
        }

    }

}
