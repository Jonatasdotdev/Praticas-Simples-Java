public class Matriz<T> {
    private T[][] matriz;
    private int tamanho;


    public Matriz(int tamanho) {
        this.tamanho = tamanho;
        matriz = (T[][]) new Object[tamanho][tamanho];
    }


    public void setElemento(int linha, int coluna, T valor) {
        if (linha >= 0 && linha < tamanho && coluna >= 0 && coluna < tamanho) {
            matriz[linha][coluna] = valor;
        } else {
            throw new IndexOutOfBoundsException("Índice fora do intervalo da matriz.");
        }
    }


    public void listarDados() {
        System.out.println("Dados da matriz:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public void imprimirDiagonalPrincipal() {
        System.out.print("Diagonal Principal: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }


    public void imprimirMatrizTransposta() {
        System.out.println("Matriz Transposta:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[j][i] + "\t");
            }
            System.out.println();
        }
    }
}
