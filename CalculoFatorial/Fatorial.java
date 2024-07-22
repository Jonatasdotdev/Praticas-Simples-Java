import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número positivo para calcular o fatorial:");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Por favor, digite um número positivo!");
        } else {
            long fatorial = calcularFatorial(n);
            System.out.println("O fatorial de " + n + " é: " + fatorial);
        }

        sc.close();
    }

    public static long calcularFatorial(int n) {
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
