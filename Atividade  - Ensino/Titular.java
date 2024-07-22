class Titular extends Professor {
    private String disciplina;

    public Titular(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void teach() {
        System.out.println("Ensino de " + disciplina);
    }
}
