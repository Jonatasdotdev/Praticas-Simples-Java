import java.util.ArrayList;
import java.util.List;

class Jogador {
    private List<Animal> mascotes;

    public Jogador() {
        this.mascotes = new ArrayList<>();
    }

    public void adquirirMascote(Animal mascote) {
        mascotes.add(mascote);
    }

    public void mostrarMascotes() {
        System.out.println("O jogador tem os seguintes animais de estimação:");
        for (Animal mascote : mascotes) {
            System.out.println(mascote.getClass().getSimpleName());
        }
    }
}
