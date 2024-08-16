public class Main {
    public static void main(String[] args) {
        AnalisadorCovid analisador = new AnalisadorCovid();


        String caminho = "";
        analisador.carregarDados(caminho);


        analisador.exibirRelatorio();


        Bairro novoBairro = new Bairro("Botafogo", 1100, 90, "2023-08-15");
        analisador.adicionarRegistro(novoBairro);


        System.out.println("\nApós adicionar um novo registro:");
        analisador.exibirRelatorio();
    }
}
