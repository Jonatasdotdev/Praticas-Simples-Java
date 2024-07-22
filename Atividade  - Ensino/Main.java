public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("CIÊNCIAS");
        titular.teach(); // -> "Ensino de ciências"

        Substituto substituto = new Substituto();
        substituto.assign("CIÊNCIAS");
        substituto.assign("GINÁSTICA");
        substituto.assign("MÚSICA");

        substituto.teach(); // -> "Ensino de ciências"
        substituto.teach(); // -> "Ditando ginástica"
        substituto.teach(); // -> "Ensinar música"
    }
}