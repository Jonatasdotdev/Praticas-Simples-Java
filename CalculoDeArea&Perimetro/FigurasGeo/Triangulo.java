public abstract class Triangulo implements figura {
    protected double lado1;
    protected double lado2;
    protected double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }


    public double calcularperimetro() {
        return lado1 + lado2 + lado3;
    }


    public abstract double calculararea();


    public abstract String toString();
}