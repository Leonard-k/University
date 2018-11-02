package Prog1.Chapter4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printMatrix(a,"a:");
    }

    private static void printMatrix(int[][] m,String s) {
        System.out.println(s);
        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
