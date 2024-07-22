import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double total = 0;

        while (true) {
            System.out.println("1. Arroz - 8 USD");
            System.out.println("2. Feijao - 10 USD");
            System.out.println("3. Batata - 15 USD");
            System.out.println("4. Carne - 100 USD");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = leia.nextInt();

            if (opcao == 0) {
                System.out.println("Total compra: " + total + " USD");
                break;

            } else if (opcao >= 1 && opcao <= 4) {
                total += obterPreco(opcao);
                System.out.println("Total compra: " + total + " USD");

            } else {
                System.out.println("Opção Inválida. Tente novamente ");

            }

        }
        leia.close();
    }

    private static double obterPreco(int opcao) {
        switch (opcao) {
            case 1:
                return 8.0;
            case 2:
                return 10.0;
            case 3:
                return 15.0;
            case 4:
                return 100.0;
            default:
                return 0.0;
        }
    }

}
1