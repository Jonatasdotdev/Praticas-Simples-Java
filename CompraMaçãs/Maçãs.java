import java.util.Scanner;

public class Maçãs {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);

        System.out.print("Digite quantas maçãs comprou: ");
        int QTmacas = le.nextInt();

        double custo = (QTmacas < 12) ? QTmacas * 1.30 : QTmacas * 1.00;

        System.out.println("O custo da sua compra foi: " + custo);

        le.close();
    }
}
