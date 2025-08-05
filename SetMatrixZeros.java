/*
public class SetMatrixZeros {

    public static void main(String[] args) {
        int[][] mat = {{0, 2, 3}, {4, 6, 6}, {7, 8, 0}};
        int row = mat.length;
        int col = mat[0].length;
        int[][] arr=findZeros(mat, row, col);
        int[][] res=makeZeros(mat,row,col);

        for (int b = 0; b < mat.length; b++) {
            for (int a = 0; a < mat[0].length; a++) {
                System.out.print(mat[b][a]+" ");
            }
            System.out.println();
        }
    }

    static int[][] findZeros(int[][] mat, int row, int col) {
        int[][] arr3= new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 0) {
                     arr3=markedRowCol(mat, i, j);
                }
            }
        }

        return arr3;
    }

    static int[][] markedRowCol(int[][] mat, int i, int j) {
        for (int r = 0; r < mat[0].length; r++) {
            mat[i][r] = -1;
        }
        for (int c = 0; c < mat.length; c++) {
            mat[c][j] = -1;
        }
       return mat;
    }
    static int[][] makeZeros(int[][] arr, int row, int col)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(arr[i][j]==-1)
                    arr[i][j]=0;
            }
        }
        return arr;
    }


}


 */

import java.util.*;

public class SetMatrixZeros {

    public static void main(String[] args) {
        int[][] mat = {{0, 2, 3}, {4, 6, 6}, {7, 8, 0}};
        int row = mat.length;
        int col = mat[0].length;

        setMatrixZeroes(mat, row, col);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void setMatrixZeroes(int[][] mat, int row, int col) {
        boolean[] zeroRows = new boolean[row];
        boolean[] zeroCols = new boolean[col];

        // Step 1: Identify the rows and columns to zero
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        // Step 2: Set rows to zero
        for (int i = 0; i < row; i++) {
            if (zeroRows[i]) {
                for (int j = 0; j < col; j++) {
                    mat[i][j] = 0;
                }
            }
        }

        // Step 3: Set columns to zero
        for (int j = 0; j < col; j++) {
            if (zeroCols[j]) {
                for (int i = 0; i < row; i++) {
                    mat[i][j] = 0;
                }
            }
        }
    }
}
