import java.util.HashMap;

public class GerenciadorContatos {
    private HashMap<String, Contato> contatos;
    private ArquivoContatos arquivoContatos;

    public GerenciadorContatos() {
        contatos = new HashMap<>();
        arquivoContatos = new ArquivoContatos("contatos.txt");
        carregarContatos();
    }

    public void carregarContatos() {
        contatos = arquivoContatos.carregarContatos();
    }

    public void adicionarContato(String nome, String telefone) {
        if (contatos.containsKey(nome)) {
            System.out.println("Contato já existe. Atualizando o número de telefone.");
        }
        Contato contato = new Contato(nome, telefone);
        contatos.put(nome, contato);
        arquivoContatos.salvarContatos(contatos);
    }

    public void consultarContato(String nome) {
        Contato contato = contatos.get(nome);
        if (contato != null) {
            System.out.println("Telefone: " + contato.getTelefone());
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void removerContato(String nome) {
        if (contatos.containsKey(nome)) {
            contatos.remove(nome);
            arquivoContatos.salvarContatos(contatos);
            System.out.println("Contato removido.");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void exibirTodosContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato disponível.");
        } else {
            System.out.println("Lista de Contatos:");
            for (Contato contato : contatos.values()) {
                System.out.println("Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone());
            }
        }
    }
}
