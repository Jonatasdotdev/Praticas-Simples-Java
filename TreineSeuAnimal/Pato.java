class Pato extends Animal implements Andar, Voar, Nadar {

    public void comer() {
        System.out.println("Pato está comendo.");
    }


    public void dormir() {
        System.out.println("Pato está dormindo.");
    }


    public void treinar() {
        System.out.println("Pato está treinando.");
    }

    public void mover() {
        andar();
        voar();
        nadar();
    }


    public void andar() {
        System.out.println("Pato pode andar.");
    }


    public void voar() {
        System.out.println("Pato pode voar.");
    }


    public void nadar() {
        System.out.println("Pato pode nadar.");
    }
}
