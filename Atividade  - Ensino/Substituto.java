import java.util.LinkedList;
import java.util.Queue;

class Substituto extends Professor {
    private Queue<String> disciplinas = new LinkedList<>();

    public void assign(String disciplina) {
        disciplinas.add(disciplina);
    }

    @Override
    public void teach() {
        if (!disciplinas.isEmpty()) {
            String disciplina = disciplinas.poll();
            String output = "Ensino de " + disciplina;
            switch (disciplina) {
                case "GINÁSTICA":
                    output = "Ditando ginástica";
                    break;
                case "MÚSICA":
                    output = "Ensinar música";
                    break;
            }
            System.out.println(output);
        } else {
            System.out.println("Nenhuma disciplina atribuída.");
        }
    }
}
