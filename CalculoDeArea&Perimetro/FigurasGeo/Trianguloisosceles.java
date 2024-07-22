public class Trianguloisosceles extends Triangulo {
    public Trianguloisosceles(double lado1, double lado2) {
        super(lado1, lado2, lado1);
    }


    public double calculararea() {
        double base = lado2;
        double altura = Math.sqrt(lado1 * lado1 - (base * base) / 4);
        return (base * altura) / 2;
    }


    public String toString() {
        return "Triângulo isósceles, área: " + calculararea() + " perímetro: " + calcularperimetro();
    }
}
