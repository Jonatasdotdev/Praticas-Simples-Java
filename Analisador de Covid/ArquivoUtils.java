import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArquivoUtils {

    public static List<Bairro> lerArquivo(String caminhoArquivo) {
        List<Bairro> bairros = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                // Divide a linha em partes usando a vírgula como delimitador
                String[] dados = linha.split(",");
                if (dados.length == 4) {
                    String nome = dados[0];
                    int casosConfirmados = Integer.parseInt(dados[1]);
                    int obitos = Integer.parseInt(dados[2]);
                    String dataAnalise = dados[3];

                    // Cria um novo objeto Bairro com os dados lidos
                    Bairro bairro = new Bairro(nome, casosConfirmados, obitos, dataAnalise);

                    // Adiciona o bairro à lista
                    bairros.add(bairro);
                } else {
                    System.err.println("Formato de linha inválido: " + linha);
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Erro ao converter número: " + e.getMessage());
        }
        return bairros;
    }

    public static void escreverArquivo(String caminhoArquivo, Bairro bairro) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo, true))) {
            String linha = String.format("%s,%d,%d,%s",
                    bairro.getNome(),
                    bairro.getCasosConfirmados(),
                    bairro.getObitos(),
                    bairro.getDataAnalise());
            bw.write(linha);
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
}}}
