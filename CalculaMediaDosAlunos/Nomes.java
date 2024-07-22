import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        double[][] notas = new double[5][3];
        double[] medias = new double[5];


        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }


        for (int i = 0; i < 5; i++) {
            System.out.println("Digite as notas de " + nomes[i] + ":");
            double soma = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
                soma += notas[i][j];
            }
            medias[i] = soma / 3; // Calcula a média das notas
        }


        System.out.println("Os nomes e médias dos alunos são:");
        for (int i = 0; i < 5; i++) {
            System.out.println(nomes[i] + " - Média: " + medias[i]);
        }

        scanner.close();
    }
}
