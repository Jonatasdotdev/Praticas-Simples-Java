import java.util.Scanner;

public class Menu {
    private GerenciadorContatos gerenciador;

    public Menu() {
        gerenciador = new GerenciadorContatos();
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu de Gerenciamento de Contatos");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Consultar Contato");
            System.out.println("3. Remover Contato");
            System.out.println("4. Exibir Todos os Contatos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    adicionarContato(scanner);
                    break;
                case 2:
                    consultarContato(scanner);
                    break;
                case 3:
                    removerContato(scanner);
                    break;
                case 4:
                    gerenciador.exibirTodosContatos();
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }

    private void adicionarContato(Scanner scanner) {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o telefone do contato: ");
        String telefone = scanner.nextLine();
        gerenciador.adicionarContato(nome, telefone);
    }

    private void consultarContato(Scanner scanner) {
        System.out.print("Digite o nome do contato que deseja consultar: ");
        String nome = scanner.nextLine();
        gerenciador.consultarContato(nome);
    }

    private void removerContato(Scanner scanner) {
        System.out.print("Digite o nome do contato que deseja remover: ");
        String nome = scanner.nextLine();
        gerenciador.removerContato(nome);
    }
}
