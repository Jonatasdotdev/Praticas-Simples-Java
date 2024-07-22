import java.util.Scanner;

public class PontuacaoAco {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a dureza do aço: ");
        double dureza = leitor.nextDouble();

        System.out.print("Digite o teor de carvão: ");
        double teorCarvao = leitor.nextDouble();

        System.out.print("Digite a resistência à tração: ");
        double resistenciaTracao = leitor.nextDouble();


        int pontuacao = 0;

        if (dureza > 50) {
            pontuacao++;
        }

        if (teorCarvao < 0.7) {
            pontuacao++;
        }

        if (resistenciaTracao > 5600) {
            pontuacao++;
        }

        
        System.out.println("\nPontuação do aço: " + pontuacao);

        
        if (pontuacao == 3) {
            System.out.println("Grau do aço: Excelente");
        } else if (pontuacao == 2) {
            System.out.println("Grau do aço: Bom");
        } else if (pontuacao == 1) {
            System.out.println("Grau do aço: Regular");
        } else {
            System.out.println("Grau do aço: Fraco");
        }

        leitor.close();
    }
}
