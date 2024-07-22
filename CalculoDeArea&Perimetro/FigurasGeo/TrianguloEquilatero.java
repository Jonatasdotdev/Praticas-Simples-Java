public class TrianguloEquilatero extends Triangulo {
    public TrianguloEquilatero(double lado) {
        super(lado, lado, lado);
    }


    public double calculararea() {
        return (Math.sqrt(3) / 4) * Math.pow(lado1, 2);
    }


    public String toString() {
        return "Triângulo equilátero, área: " + calculararea() + " perímetro: " + calcularperimetro();
    }
}
