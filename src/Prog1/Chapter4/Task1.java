package Prog1.Chapter4;

        import Prog1.UniUtils;

        import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        // initialise 2 arrays of length n
        int n = 5;
        int[] array1 = new int[n];
        array1[0] = 1;
        int[] array2 = new int[n];

        // print length and content of the two arrays
        System.out.println("array1: " + Arrays.toString(array1) + " length: " + array1.length);
        System.out.println("array2: " + Arrays.toString(array2) + " length: " + array2.length +"\n");

        // test reference equality
        System.out.println("array1 reference == array2 reference? : " + (array1 == array2) +"\n");

        // copy array1 in array2
        for (int i = 0; i < n; i++) {
            array2[i] = array1[i];
        }

        // print new array2
        System.out.println("array2 after copying: " + Arrays.toString(array2) + " length: " + array2.length);

        UniUtils.printAuthor();
    }
}
