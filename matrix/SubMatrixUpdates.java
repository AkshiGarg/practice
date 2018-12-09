import java.util.Scanner;

public class SubMatrixUpdates {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int cols = s.nextInt();
        int op = s.nextInt();
        int i = 0, j = 0;
        int[][] mat = new int[rows][cols];
        // create matrix
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                mat[i][j] = s.nextInt();
            }
        }

        // perform operations
        for (int k = 0; k < op; k++) {
            int r = s.nextInt();
            int c = s.nextInt();
            int sub = s.nextInt();
            int d = s.nextInt();
            if (sub <= Math.min(rows, cols)) {
                for (i = r - 1; i < r + sub - 1; i++) {
                    for (j = c - 1; j < c + sub - 1; j++) {
                        mat[i][j] += d;
                    }
                }
            }
        }

        // print matrix
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
