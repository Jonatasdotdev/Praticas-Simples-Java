import java.util.ArrayList;
import java.util.List;

public class AnalisadorCovid {

    private List<Bairro> bairros;

    public AnalisadorCovid() {
        bairros = new ArrayList<>();
    }

    // Alteração: caminho fixo para o arquivo 'casos.csv' na mesma pasta do programa
    public void carregarDados(String caminho) {
        String caminhoArquivo = "casos.csv";
        bairros = ArquivoUtils.lerArquivo(caminhoArquivo);
    }

    public void adicionarRegistro(Bairro bairro) {
        bairros.add(bairro);
        ArquivoUtils.escreverArquivo("casos.csv", bairro);
    }

    public List<Bairro> obterBairros() {
        return bairros;
    }

    public Bairro obterMaiorTaxaCrescimento() {
        if (bairros.isEmpty()) {
            return null;
        }

        Bairro bairroMaiorTaxa = null;
        double maiorTaxaCrescimento = Double.NEGATIVE_INFINITY;

        for (Bairro bairro : bairros) {
            int casosAnteriores = calcularCasosAnteriores(bairro.getNome(), bairro.getDataAnalise());
            double taxaCrescimento = bairro.calcularTaxaCrescimento(casosAnteriores);

            if (taxaCrescimento > maiorTaxaCrescimento) {
                maiorTaxaCrescimento = taxaCrescimento;
                bairroMaiorTaxa = bairro;
            }
        }

        return bairroMaiorTaxa;
    }

    public Bairro obterMaiorTaxaLetalidade() {
        if (bairros.isEmpty()) {
            return null;
        }

        Bairro bairroMaiorLetalidade = null;
        double maiorTaxaLetalidade = Double.NEGATIVE_INFINITY;

        for (Bairro bairro : bairros) {
            double taxaLetalidade = bairro.calcularTaxaLetalidade();

            if (taxaLetalidade > maiorTaxaLetalidade) {
                maiorTaxaLetalidade = taxaLetalidade;
                bairroMaiorLetalidade = bairro;
            }
        }

        return bairroMaiorLetalidade;
    }

    private int calcularCasosAnteriores(String nomeBairro, String dataAnaliseAtual) {
        int casosAnteriores = 0;
        for (Bairro bairro : bairros) {
            if (bairro.getNome().equals(nomeBairro) && !bairro.getDataAnalise().equals(dataAnaliseAtual)) {
                casosAnteriores = bairro.getCasosConfirmados();
                break;
            }
        }
        return casosAnteriores;
    }

    public void exibirRelatorio() {
        System.out.println("=== Relatório de Evolução da COVID-19 ===");

        for (Bairro bairro : bairros) {
            System.out.println("Bairro: " + bairro.getNome());
            System.out.println("Casos Confirmados: " + bairro.getCasosConfirmados());
            System.out.println("Óbitos: " + bairro.getObitos());
            System.out.println("Data da Análise: " + bairro.getDataAnalise());

            int casosAnteriores = calcularCasosAnteriores(bairro.getNome(), bairro.getDataAnalise());
            double taxaCrescimento = bairro.calcularTaxaCrescimento(casosAnteriores);
            double taxaLetalidade = bairro.calcularTaxaLetalidade();

            System.out.println("Taxa de Crescimento: " + String.format("%.2f", taxaCrescimento) + "%");
            System.out.println("Taxa de Letalidade: " + String.format("%.2f", taxaLetalidade) + "%");
            System.out.println("---------------------------------------");
        }

        Bairro maiorCrescimento = obterMaiorTaxaCrescimento();
        if (maiorCrescimento != null) {
            System.out.println("Bairro com Maior Taxa de Crescimento:");
            System.out.println("Nome: " + maiorCrescimento.getNome());
            System.out.println("Taxa de Crescimento: " + String.format("%.2f", maiorCrescimento.calcularTaxaCrescimento(
                    calcularCasosAnteriores(maiorCrescimento.getNome(), maiorCrescimento.getDataAnalise()))) + "%");
        }

        Bairro maiorLetalidade = obterMaiorTaxaLetalidade();
        if (maiorLetalidade != null) {
            System.out.println("Bairro com Maior Taxa de Letalidade:");
            System.out.println("Nome: " + maiorLetalidade.getNome());
            System.out.println("Taxa de Letalidade: " + String.format("%.2f", maiorLetalidade.calcularTaxaLetalidade()) + "%");
        }

        System.out.println("=== Fim do Relatório ===");
    }
}
