import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RemoveDuplos RemoveDuplos = new RemoveDuplos();

        System.out.println("Digite os elementos da lista separados por espaço (números ou letras):");
        String entrada = scanner.nextLine();
        String[] elementos = entrada.split(" ");

        for (String elemento : elementos) {
            RemoveDuplos.adicionarElemento(elemento);
        }

        RemoveDuplos.removerDuplicados();
        RemoveDuplos.imprimirResultados();

        scanner.close();
    }
}
