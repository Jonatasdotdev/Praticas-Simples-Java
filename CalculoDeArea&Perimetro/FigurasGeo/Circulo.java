public class Circulo  implements figura{

    private double raio;
    public Circulo(double raio){
        this.raio = raio;

    }
    public double calculararea(){
        return Math.PI * Math.pow(raio, 2);
    }


    public double calcularperimetro() {

        return 2 * Math.PI * raio;
    }


    public String toString() {

        return String.format("Círculo, área: %.3f perímetro: %.4f", calculararea(), calcularperimetro());
        }
    }

