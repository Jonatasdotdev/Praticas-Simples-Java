import java.util.Scanner;

public class DiasDaSemana {

    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        System.out.print("Digite o dia da Semana ");

        int numero = le.nextInt();

        switch (numero) {

            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda");
                break;

            case 3:
                System.out.println("Terça");
                break;

            case 4:
                System.out.println("Quarta");
                break;

            case 5:
                System.out.println("Quinta");
                break;

            case 6:
                System.out.println("Sexta");
                break;

            case 7:
                System.out.println("Sábado");
                break;

            default:
                System.out.println("Dia da semana não existe");
        }

        le.close();
    }
}
