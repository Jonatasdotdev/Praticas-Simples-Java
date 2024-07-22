import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private List<Aluno> alunos;

    public Universidade() {
        this.alunos = new ArrayList<>();
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void atribuirCurso(int indiceAluno, String curso) {
        if (indiceAluno >= 0 && indiceAluno < alunos.size()) {
            alunos.get(indiceAluno).addCurso(curso);
        } else {
            System.out.println("Índice de aluno inválido.");
        }
    }

    public void promoverNota(int indiceAluno, int novaNota) {
        if (indiceAluno >= 0 && indiceAluno < alunos.size()) {
            alunos.get(indiceAluno).setNota(novaNota);
        } else {
            System.out.println("Índice de aluno inválido.");
        }
    }

    public List<String> listarAlunosPorCurso(String curso) {
        List<String> alunosDoCurso = new ArrayList<>();
        for (Aluno aluno : alunos) {
            if (aluno.getCursos().contains(curso)) {
                alunosDoCurso.add(aluno.getNome());
            }
        }
        return alunosDoCurso;
    }

    public void listarTodosAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
