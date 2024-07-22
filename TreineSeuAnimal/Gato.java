class Gato extends Animal implements Andar {

    public void comer() {
        System.out.println("Gato está comendo.");
    }


    public void dormir() {
        System.out.println("Gato está dormindo.");
    }


    public void treinar() {
        System.out.println("Gato está treinando.");
    }


    public void mover() {
        andar();
    }

    @Override
    public void andar() {
        System.out.println("Gato pode andar.");
    }
}







