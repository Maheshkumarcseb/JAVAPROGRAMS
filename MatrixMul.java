import java.util.*;

public class MatrixMul {
    public static void main(String[] args)
    {
        int mat1[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int mat2[][] = {
                {3, 2, 1},
                {6, 5, 2},
                {4, 9, 8}
        };

        int r1 = mat1.length;
        int c1 = mat1[0].length;
        int r2 = mat2.length;
        int c2 = mat2[0].length;

        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible");
            System.exit(0);
        }

        multiplyMatrices(mat1, mat2, r1, c1, r2, c2);
    }

    static void multiplyMatrices(int[][] mat1, int[][] mat2, int r1, int c1, int r2, int c2)
    {
        int[][] result = new int[r1][c2]; // Resultant matrix

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        // Printing the result
        System.out.println("Result of Matrix Multiplication:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
