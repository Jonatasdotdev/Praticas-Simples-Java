import java.util.ArrayList;
import java.util.List;


abstract class Instrumento {
    public abstract void play(String nota);
    public abstract void play();
    public abstract String toString();
}

class Orquestra {
    private List<Instrumento> instrumentos;

    public Orquestra() {
        instrumentos = new ArrayList<>();
    }

    public void add(Instrumento instrumento) {
        instrumentos.add(instrumento);
    }

    public void play() {
        for (Instrumento instrumento : instrumentos) {
            instrumento.play();
        }
    }

    public void play(int index) {
        if (index >= 0 && index < instrumentos.size()) {
            instrumentos.get(index).play();
        } else {
            System.out.println("Índice fora do intervalo.");
        }
    }
}


