import java.util.Scanner;

public class Fibonnaci {

    static int Fibonnaci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return Fibonnaci(n - 1) + Fibonnaci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.print("Digite o termo Fibonnaci");
        numero = entrada.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.println(Fibonnaci(i));

        }

    }
}