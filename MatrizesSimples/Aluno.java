import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private int nota;
    private List<String> cursos;

    public Aluno(String nome, int nota, List<String> cursos) {
        this.nome = nome;
        this.nota = nota;
        this.cursos = new ArrayList<>(cursos != null ? cursos : new ArrayList<>());
    }

    public void addCurso(String curso) {
        this.cursos.add(curso);
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    public List<String> getCursos() {
        return cursos;
    }


    public String toString() {
        return "Nome: " + nome + ", Nota: " + nota + ", Cursos: " + String.join(", ", cursos);
    }
}
