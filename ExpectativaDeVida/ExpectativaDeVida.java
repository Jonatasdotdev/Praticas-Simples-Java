import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExpectativaDeVida {
    public static void main(String[] args) {

        Map<String, Double> expectativaMap = new HashMap<>();
        String caminhoArquivo = "pesquisa.csv";


        try {

            BufferedReader br1 = new BufferedReader(new FileReader(caminhoArquivo));
            br1.readLine();
            String linha;

            while ((linha = br1.readLine()) != null) {

                String[] partes = linha.split(";");
                String regiao = partes[0];


                double soma = 0;
                int contador = 0;


                for (int i = 1; i < partes.length; i++) {

                    String valorTexto = partes[i];
                    soma += Double.parseDouble(valorTexto);
                    contador++;
                }

                double media = 0;
                if (contador > 0) {
                    for (int j = 0; j < contador; j++) {
                        media = soma / contador;
                    }
                    media /= contador;
                }

                expectativaMap.put(regiao, media);
            }
            br1.close();

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }


        for (String regiao : expectativaMap.keySet()) {
            double media = expectativaMap.get(regiao);
            System.out.printf("Região: %s, Média da Expectativa de Vida: %.2f anos%n", regiao, media);
        }
    }
}
