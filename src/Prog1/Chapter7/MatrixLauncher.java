package Prog1.Chapter7;

import java.util.Scanner;

public class MatrixLauncher {
    // todo docs

    public static void main(String[] args) {

        // declare variables
        Scanner scan = new Scanner(System.in);
        int[][] matrixA, matrixB, matrixC;

        // loop
        while (true) {

            int nA, mA, nB, mB;

            // input matrix dimensions
            System.out.println("enter dimension n of matrix A");
            nA = Integer.parseInt(scan.nextLine());
            System.out.println("enter dimension m of matrix A");
            mA = Integer.parseInt(scan.nextLine());
            System.out.println("enter dimension n of matrix B");
            nB = Integer.parseInt(scan.nextLine());
            System.out.println("enter dimension m of matrix B");
            mB = Integer.parseInt(scan.nextLine());

            // initialize matrixA and matrixB
            matrixA = MatrixOperations.createMatrix(nA, mA);
            matrixB = MatrixOperations.createMatrix(nB, mB);

            // print both matrices
            MatrixOperations.printMatrix(matrixA, "matrixA");
            MatrixOperations.printMatrix(matrixB, "matrixB");

            // add matrixB to matrixA
            matrixC = MatrixOperations.sumMatrix(matrixA, matrixB);
            MatrixOperations.printMatrix(matrixC, "matrixA + matrixB");

            // multiply matrixA with matrixB
            matrixC = MatrixOperations.matrixMultiplication(matrixA, matrixB);
            MatrixOperations.printMatrix(matrixC, "matrixA * matrixB");

            // yes continue else break
            System.out.println("do you want to continue? [y / n]");
            if (!scan.nextLine().equals("y")) {
                break;
            }
        }

    }
}
