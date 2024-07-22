import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;

        System.out.print("digite o numero: ");
        numero = leia.nextInt();

        int resultado = somatorio(numero);

        System.out.println("a soma dos digitos de " + numero + " e: " + resultado);
    }

    private static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero % 10 + somatorio(numero / 10);
        }
    }
}
