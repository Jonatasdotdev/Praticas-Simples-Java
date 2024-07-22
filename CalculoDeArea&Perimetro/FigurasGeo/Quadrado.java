public class Quadrado extends Retangulo {
    public Quadrado(double lado) {
        super(lado, lado);
    }


    public String toString() {
        return "Quadrado, área: " + calculararea() + " perímetro: " + calcularperimetro();
    }
}
