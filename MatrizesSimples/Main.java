import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Universidade universidade = new Universidade();


        Aluno aluno1 = new Aluno("Jôna", 1, Arrays.asList("Induction"));
        Aluno aluno2 = new Aluno("Paulo", 2, Arrays.asList("Science"));
        Aluno aluno3 = new Aluno("Isa", 3, Arrays.asList("Maths"));
        Aluno aluno4 = new Aluno("Liz", 4, Arrays.asList("Database I"));


        universidade.addAluno(aluno1);
        universidade.addAluno(aluno2);
        universidade.addAluno(aluno3);
        universidade.addAluno(aluno4);


        universidade.atribuirCurso(3, "Science");


        universidade.promoverNota(1, 5);


        List<String> alunosDeScience = universidade.listarAlunosPorCurso("Science");
        System.out.println("Alunos de Science: " + alunosDeScience);


        universidade.listarTodosAlunos();
    }
}
