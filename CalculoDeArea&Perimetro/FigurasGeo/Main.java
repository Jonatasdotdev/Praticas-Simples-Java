
public class Main extends Quadrado {
    public Main(double lado) {
        super(lado);
    }

    public static void main(String[] args) {
        figura circle = new Circulo(10);
        System.out.println(circle);

        figura rectangle = new Retangulo(15, 7);
        System.out.println(rectangle);

        figura equilateralTriangle = new TrianguloEquilatero(7);
        System.out.println(equilateralTriangle);

       figura square = new Quadrado(2);
        System.out.println(square);
    }
}
