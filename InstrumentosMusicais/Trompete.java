class Trompete extends Instrumento {

    public void play(String nota) {
        System.out.println("Trompete tocando a nota: " + nota);
    }


    public void play() {
        System.out.println("Trompete está tocando.");
    }


    public String toString() {
        return "Trompete";
    }
}