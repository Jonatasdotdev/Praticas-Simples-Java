public class TreineSeuAnimal {
    public static void main(String[] args) {
        Animal m1 = new Gato();
        Animal m2 = new Pato();
        Animal m3 = new Lagarto();
        Animal m4 = new Falcao();
        Animal m5 = new Morcego();

        Jogador jogador = new Jogador();
        jogador.adquirirMascote(m1);
        jogador.adquirirMascote(m2);

        jogador.mostrarMascotes();

        System.out.println("Comportamento m1:");
        m1.mover();

        System.out.println("Comportamento m2:");
        m2.mover();

        System.out.println("Comportamento m3:");
        m3.mover();

        System.out.println("Comportamento m4:");
        m4.mover();

        System.out.println("Comportamento m5:");
        m5.mover();
    }
}
