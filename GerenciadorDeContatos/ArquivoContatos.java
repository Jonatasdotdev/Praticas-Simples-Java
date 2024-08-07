import java.io.*;
import java.util.HashMap;

public class ArquivoContatos {
    private String nomeArquivo;

    public ArquivoContatos(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public HashMap<String, Contato> carregarContatos() {
        HashMap<String, Contato> contatos = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 2) {
                    String nome = partes[0].trim();
                    String telefone = partes[1].trim();
                    Contato contato = new Contato(nome, telefone);
                    contatos.put(nome, contato);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado. Um novo arquivo será criado.");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return contatos;
    }

    public void salvarContatos(HashMap<String, Contato> contatos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Contato contato : contatos.values()) {
                writer.write(contato.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar os contatos: " + e.getMessage());
        }
    }
}
