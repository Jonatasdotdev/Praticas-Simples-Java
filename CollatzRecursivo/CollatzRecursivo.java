import java.util.Scanner;

public class CollatzRecursivo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o limite: ");
        int limite = leia.nextInt();

        int numeroComSequenciaMaisLarga = 1;
        int maximoPassos = 0;

        for (int i = 1; i <= limite; i++) {
            int passos = calcularPassosCollatz(i);

            if (passos > maximoPassos) {
                maximoPassos = passos;
                numeroComSequenciaMaisLarga = i;
            }
        }

        System.out.println("Número com a sequência mais longa: " + numeroComSequenciaMaisLarga);
        System.out.println("Passos desse número: " + maximoPassos);
        System.out.print("Sequência: ");
        exibirSequenciaCollatz(numeroComSequenciaMaisLarga);

        leia.close();
    }

    private static int calcularPassosCollatz(int numero) {
        if (numero == 1) {
            return 0;
        } else if (numero % 2 == 0) {
            return 1 + calcularPassosCollatz(numero / 2);
        } else {
            return 1 + calcularPassosCollatz(3 * numero + 1);
        }
    }

    private static void exibirSequenciaCollatz(int numero) {
        if (numero == 1) {
            System.out.println(numero);
        } else {
            System.out.print(numero + ", ");
            if (numero % 2 == 0) {
                exibirSequenciaCollatz(numero / 2);
            } else {
                exibirSequenciaCollatz(3 * numero + 1);
            }
        }
    }
}
