class Falcao extends Animal implements Voar, Andar {

    public void comer() {
        System.out.println("Falcão está comendo.");
    }


    public void dormir() {
        System.out.println("Falcão está dormindo.");
    }


    public void treinar() {
        System.out.println("Falcão está treinando.");
    }


    public void mover() {
        voar();
        andar();
    }


    public void voar() {
        System.out.println("Falcão pode voar.");
    }


    public void andar() {
        System.out.println("Falcão pode andar.");
    }
}