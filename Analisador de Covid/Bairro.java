public class Bairro {
    private String nome;
    private int casosConfirmados;
    private int obitos;
    private String dataAnalise;

    public Bairro(String nome, int casosConfirmados, int obitos, String dataAnalise) {
        this.nome = nome;
        this.casosConfirmados = casosConfirmados;
        this.obitos = obitos;
        this.dataAnalise = dataAnalise;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCasosConfirmados() {
        return casosConfirmados;
    }

    public void setCasosConfirmados(int casosConfirmados) {
        this.casosConfirmados = casosConfirmados;
    }

    public int getObitos() {
        return obitos;
    }

    public void setObitos(int obitos) {
        this.obitos = obitos;
    }

    public String getDataAnalise() {
        return dataAnalise;
    }

    public void setDataAnalise(String dataAnalise) {
        this.dataAnalise = dataAnalise;
    }

    // Métodos de cálculo

    public double calcularTaxaCrescimento(int casosAnterior) {
        if (casosAnterior == 0) return 0;
        return ((double) (casosConfirmados - casosAnterior) / casosAnterior) * 100;
    }

    public double calcularTaxaLetalidade() {
        if (casosConfirmados == 0) return 0;
        return ((double) obitos / casosConfirmados) * 100;
    }
}
