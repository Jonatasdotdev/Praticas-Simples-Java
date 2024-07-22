public class Alunos {

    private int matricula;
    private String nome;
    private String email;
    private String curso;
    private int telefone;
    private String endereco;
    private int faltas;
    private int notas[];

    Alunos(int matricula, String nome, String email, String curso, int telefone, String endereco, int faltas,
            int[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.curso = curso;
        this.telefone = telefone;
        this.endereco = endereco;
        this.setfaltas(faltas);
        this.notas = notas;
    }

    // seter
    public int getmatricula() {
        return matricula;
    }

    public String getnome() {
        return nome;
    }

    public String getemail() {
        return email;
    }

    public String getcurso() {
        return curso;
    }

    public int gettelefone() {
        return telefone;
    }

    public String getendereco() {
        return endereco;
    }

    public int getfaltas() {
        return faltas;
    }

    public void setfaltas(int faltas) {
        this.faltas = faltas;
    }

    public int[] getnotas() {
        return notas;
    }

    public void calculanota() {
        int total = notatotal();
        if (total >= 70 && faltas <= 15) {
            System.out.println(nome + " Aprovado");

        } else if (total < 50 || faltas > 15) {
            System.out.println(nome + " Reprovado");

        } else if (total >= 50 && total < 70 && faltas <= 15) {
            System.out.println(nome + " ira fazer exame");
        }

    }

    private int notatotal() {
        int Somanotas = 0;
        for (int nota : notas) {
            Somanotas += nota;
        }
        return Somanotas;
    }

    public int calculamedia() {
        int somanotas = 0;
        for (int nota : notas) {
            somanotas += nota;
        }
        return (int) somanotas / notas.length;
    }

    public double porcentagemdefalta(int totalfaltas) {

        return ((double) faltas / totalfaltas) * 100;

    }

}
