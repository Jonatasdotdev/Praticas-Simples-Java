import java.util.Scanner;

public class ContaLetras {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o número de letras: ");
        int quantidadeLetras = leia.nextInt();

        char[] vcharacters = new char[quantidadeLetras];

        for (int i = 0; i < quantidadeLetras; i++) {
            System.out.print("Digite a letra para a posição " + i + ": ");
            vcharacters[i] = leia.next().charAt(0);
        }

        int vogais = contaVogais(vcharacters);
        int consoantes = quantidadeLetras - vogais;

        System.out.println("Consoantes: " + consoantes);
        System.out.println("Vogais: " + vogais);
    }

    public static int contaVogais(char[] vcharacters) {
        int count = 0;
        for (char letra : vcharacters) {
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                    letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                count++;
            }
        }
        return count;
    }
}
