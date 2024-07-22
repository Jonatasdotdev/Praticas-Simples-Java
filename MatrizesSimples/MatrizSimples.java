
public class MatrizSimples {

    public static void main(String[] args) {
        int N = 11;
        int M = 11;

        int[][] mat = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                mat[i][j] = (int) (Math.random() * 10);

                if (i == 0 || i == mat.length - 1 || j == 0 || j == mat[i].length - 1) {
                    System.out.print("[" + mat[i][j] + "]");
                } else {
                    System.out.print("-");
                }

            }
        }

    }
}
