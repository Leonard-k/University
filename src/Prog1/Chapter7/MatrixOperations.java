package Prog1.Chapter7;
import java.util.Arrays;

public class MatrixOperations {

    /**
     * Returns a new Matrix of the size n times m
     * initialized with random numbers from 0 to 9 inclusive.
     * @param n one dimension size of the new matrix
     * @param m the other dimension size of the new matrix
     * @return an matrix of size n times m
     */
    public static int[][] createMatrix(int n, int m) {

        // check input
        if (n <= 0 || m <= 0) {
            return new int[0][0];
        }

        // declare matrix
        int[][] matrix = new int[n][m];

        // fill matrix with random values from 0 to 9
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }

        return matrix;
    }

    /**
     *  Prints the matrix m, with the String s as heading,
     *  to standard output.
     * @param m the matrix
     * @param s the header String
     */
    public static void printMatrix(int[][] m, String s) {
        System.out.println(s);
        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }

    /**
     *  Returns the sum of matrixA and matrixB if possible
     *  and an empty matrix otherwise.
     * @param matrixA the first matrix
     * @param matrixB the second matrix
     * @return the sum if possible else an empty matrix
     */
    public static int[][] sumMatrix(int[][] matrixA, int[][] matrixB) {

        // check for same dimensions
        if (matrixA.length == 0 || matrixA.length != matrixB.length || matrixA[0].length != matrixB.length) {
            return new int[0][0];
        }

        // declare matrixC
        int[][] matrixC = new int[matrixA.length][matrixA[0].length];

        // fill matrixC with the sum of the values in matrixA and matrixB
        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixC[0].length; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // return matrixC
        return matrixC;
    }

    /**
     *  Returns the product of matrixA and matrixB if possible
     *  and an empty matrix otherwise.
     * @param matrixA the first matrix
     * @param matrixB the second matrix
     * @return the product if possible else an empty matrix
     */
    public static int[][] matrixMultiplication(int[][] matrixA, int[][] matrixB) {

        // check input for empty or not matching matrices
        if (matrixA.length == 0 || matrixA[0].length == 0 || matrixB.length == 0 || matrixB[0].length == 0 || (matrixA.length != matrixB[0].length)) {
            return new int[0][0];

        }

        // declare matrixC
        int[][] matrixC = new int[matrixA.length][matrixB[0].length];

        // multiply matrixA with matrixB
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {

                // create product
                for (int k = 0; k < matrixB.length; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // return matrixC
        return matrixC;
    }
}

