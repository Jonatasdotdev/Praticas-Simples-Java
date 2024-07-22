import java.util.InputMismatchException;
import java.util.Scanner;


public static void main(String[] ags) {


    Scanner scanner = new Scanner(System.in);
    try {

        System.out.print("Digite a cordenada x: ");
        int x = scanner.nextInt();
        System.out.print("Digite a cordenada y: ");
        int y = scanner.nextInt();

        if (x < 0 && y > 0) {
            System.out.print("O ponto está no quadrante 1");

        } else if (x > 0 && y > 0) {
            System.out.print("O ponto está no quadrante 2");

        } else if (x < 0 && y < 0) {
            System.out.print("O ponto está no quadrante 3");

        } else if (x > 0 && y < 0) {
            System.out.print("O ponto está no quadrante 4");
        } else {
            System.out.print("As coordenadas não podem ser 0");
        }
    }catch(InputMismatchException e){
        System.out.print("digite apenas valores numéricos válidos.");
    }




}
