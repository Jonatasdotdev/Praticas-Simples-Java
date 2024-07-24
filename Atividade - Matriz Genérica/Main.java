
public class Main {
    public static void main(String[] args) {

        Matriz<Integer> matrizInteiros = new Matriz<>(3);
        matrizInteiros.setElemento(0, 0, 2);
        matrizInteiros.setElemento(0, 1, 3);
        matrizInteiros.setElemento(0, 2, 5);
        matrizInteiros.setElemento(1, 0, 7);
        matrizInteiros.setElemento(1, 1, 8);
        matrizInteiros.setElemento(1, 2, 9);
        matrizInteiros.setElemento(2, 0, 1);
        matrizInteiros.setElemento(2, 1, 5);
        matrizInteiros.setElemento(2, 2, 4);

        System.out.println("Matriz de Inteiros:");
        matrizInteiros.listarDados();
        matrizInteiros.imprimirDiagonalPrincipal();
        matrizInteiros.imprimirMatrizTransposta();

        System.out.println();

        // Criando e preenchendo uma matriz de caracteres
        Matriz<Character> matrizCaracteres = new Matriz<>(3);
        matrizCaracteres.setElemento(0, 0, 'a');
        matrizCaracteres.setElemento(0, 1, 'b');
        matrizCaracteres.setElemento(0, 2, 'c');
        matrizCaracteres.setElemento(1, 0, 'd');
        matrizCaracteres.setElemento(1, 1, 'r');
        matrizCaracteres.setElemento(1, 2, 'f');
        matrizCaracteres.setElemento(2, 0, 'g');
        matrizCaracteres.setElemento(2, 1, 'h');
        matrizCaracteres.setElemento(2, 2, 'i');

        System.out.println("Matriz de Caracteres:");
        matrizCaracteres.listarDados();
        matrizCaracteres.imprimirDiagonalPrincipal();
        matrizCaracteres.imprimirMatrizTransposta();

        System.out.println();

        // preenchendo a matriz de Strings
        Matriz<String> matrizStrings = new Matriz<>(3);
        matrizStrings.setElemento(0, 0, "um");
        matrizStrings.setElemento(0, 1, "dois");
        matrizStrings.setElemento(0, 2, "três");
        matrizStrings.setElemento(1, 0, "quatro");
        matrizStrings.setElemento(1, 1, "cinco");
        matrizStrings.setElemento(1, 2, "seis");
        matrizStrings.setElemento(2, 0, "sete");
        matrizStrings.setElemento(2, 1, "oito");
        matrizStrings.setElemento(2, 2, "nove");

        System.out.println("Matriz de Strings:");
        matrizStrings.listarDados();
        matrizStrings.imprimirDiagonalPrincipal();
        matrizStrings.imprimirMatrizTransposta();
    }
}
