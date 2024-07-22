import java.util.Scanner;

public class PrinterError {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a string de controle: ");
        String s = scanner.next();

        System.out.println(errorPrinter(s));

        scanner.close();
    }

    private static String errorPrinter(String s) {
        int errorCount = 0;
        int totalCharacters = s.length();

        for (int i = 0; i < totalCharacters; i++) {
            char c = s.charAt(i);
            if (c < 'a' || c > 'm') {
                errorCount++;
            }
        }

        String result = errorCount + "/" + totalCharacters;

        return result;
    }
}
