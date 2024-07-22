class Guitarra extends Instrumento {

    public void play(String nota) {
        System.out.println("Guitarra tocando a nota: " + nota);
    }


    public void play() {
        System.out.println("Guitarra está tocando.");
    }


    public String toString() {
        return "Guitarra";
    }
}