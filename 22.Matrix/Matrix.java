import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        // Static values for demonstration
        int rows = 2, cols = 2;
        int[][] A = {
            {1, 2},
            {3, 4}
        };
        int[][] B = {
            {5, 6},
            {7, 8}
        };

        // Addition
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Sum of matrices:");
        printMatrix(sum);

        // Subtraction
        int[][] diff = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                diff[i][j] = A[i][j] - B[i][j];
            }
        }
        System.out.println("Difference of matrices:");
        printMatrix(diff);

        // Multiplication
        int[][] prod = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                prod[i][j] = 0;
                for (int k = 0; k < cols; k++) {
                    prod[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Product of matrices:");
        printMatrix(prod);
    }

    static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
