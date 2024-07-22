public class TrianguloEscaleno extends Triangulo {
    public TrianguloEscaleno(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
    }


    public double calculararea() {
        double s = calcularperimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }


    public String toString() {
        return "Triângulo escaleno, área: " + calculararea() + " perímetro: " + calcularperimetro();
    }
}
