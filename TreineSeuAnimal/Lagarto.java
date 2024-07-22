class Lagarto extends Animal implements Andar {

    public void comer() {
        System.out.println("Lagarto está comendo.");
    }


    public void dormir() {
        System.out.println("Lagarto está dormindo.");
    }


    public void treinar() {
        System.out.println("Lagarto está treinando.");
    }


    public void mover() {
        andar();
    }


    public void andar() {
        System.out.println("Lagarto pode andar.");
    }
}