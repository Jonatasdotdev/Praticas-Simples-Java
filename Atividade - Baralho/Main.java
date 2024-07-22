import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Scanner scanner = new Scanner(System.in);
        boolean gameon = true;

        while (gameon) {
            System.out.println("1 - Jogar");
            System.out.println("2 -  Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    if (deck.cartasresto() < 2) {
                        System.out.println("Cartas insuficientes no baralho. Embaralhando novamente...");
                        deck = new Deck();
                    }

                    Card playerCard = deck.darcartas();
                    Card machineCard = deck.darcartas();

                    System.out.println("Sua carta: " + playerCard);
                    System.out.println("Carta da máquina: " + machineCard);

                    int playerValue = playerCard.getValue();
                    int machineValue = machineCard.getValue();

                    if (playerValue > machineValue) {
                        System.out.println("GANHOU");
                    } else if (machineValue > playerValue) {
                        System.out.println("A máquina ganhou");
                    } else {
                        System.out.println("Empate");
                    }
                    break;

                case 2:
                    gameon = false;
                    System.out.println("Saindo do jogo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
