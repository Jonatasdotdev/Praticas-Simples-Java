
public class Retangulo implements figura {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;

    }
    public double calculararea() {
        return largura * altura;
    }
    public double calcularperimetro() {
        return 2 * (largura + altura);

    }
    public String toString() {
        return "Retangulo area: " + calculararea() + " perimetro: " + calcularperimetro();

    }


}
