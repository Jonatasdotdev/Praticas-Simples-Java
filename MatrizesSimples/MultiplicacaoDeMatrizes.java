import java.util.Scanner;

public class MultiplicacaoDeMatrizes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int Linha1 = 2;
        int Coluna1 = 2;
        int linha2 = 2;
        int coluna2 = 2;

        int[][] matriz1 = new int[Linha1][Coluna1];
        int[][] matriz2 = new int[linha2][coluna2];

        for (int i = 0; i < Linha1; i++) {
            for (int j = 0; j < Coluna1; j++) {
                System.out.print("Digite o valor da primeira matriz:");
                matriz1[i][j] = entrada.nextInt();

            }
            System.out.print(" ");

        }

        for (int i = 0; i < linha2; i++) {
            for (int j = 0; j < coluna2; j++) {
                System.out.print("Digite o valor da segunda matriz:");
                matriz2[i][j] = entrada.nextInt();

            }
            System.out.print(" ");
        }
        if (matriz1[0].length == matriz1.length) {
            int[][] matriz3 = new int[Linha1][coluna2];
            for (int i = 0; i < Linha1; i++) {
                for (int j = 0; j < coluna2; j++) {
                    for (int k = 0; k < linha2; k++) {
                        matriz3[i][j] += matriz1[i][k] * matriz2[k][j];
                    }
                }
            }
            for (int i = 0; i < Linha1; i++) {
                for (int j = 0; j < coluna2; j++) {
                    System.out.print(matriz3[i][j] + " ");

                }
                System.out.print(" ");
            }

        } else {
            System.out.print("Não foi possível realizar a operação");
        }

    }
}
