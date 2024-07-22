class Morcego extends Animal implements Voar {

    public void comer() {
        System.out.println("Morcego está comendo.");
    }


    public void dormir() {
        System.out.println("Morcego está dormindo.");
    }


    public void treinar() {
        System.out.println("Morcego está treinando.");
    }


    public void mover() {
        voar();
    }


    public void voar() {
        System.out.println("Morcego pode voar.");
    }
}