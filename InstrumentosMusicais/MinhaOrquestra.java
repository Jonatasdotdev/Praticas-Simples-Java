
public class MinhaOrquestra {
    public static void main(String[] args) {
        Instrumento guitarra = new Guitarra();
        Instrumento tambor = new Tambor();
        Instrumento trompete = new Trompete();

        Orquestra orquestra = new Orquestra();
        orquestra.add(guitarra);
        orquestra.add(tambor);
        orquestra.add(trompete);


        orquestra.play();

        // tocar um instrumento específico
        orquestra.play(0);
    }
}