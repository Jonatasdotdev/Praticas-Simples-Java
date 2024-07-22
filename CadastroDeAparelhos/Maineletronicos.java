public class Maineletronicos {

    public static void main(String[] args) {

        Televisor televisor = new Televisor();
        Ipod ipod = new Ipod();
        Smartphone smartphone = new Smartphone();
        Bolsa bolsa = new Bolsa();

        televisor.ligar();
        ipod.ligar();
        smartphone.ligar();
        bolsa.inserirEletronico(smartphone);
        bolsa.inserirEletronico(televisor);

    }
}
