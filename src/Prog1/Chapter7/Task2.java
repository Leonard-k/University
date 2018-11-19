package Prog1.Chapter7;
import Prog1.UniUtils;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        // initialize 2 int values
        int intA = 5;
        int intB = intA;

        // initialize 2 arrays
        int[] arrayA = {5};
        int[] arrayB = arrayA;

        //print everything
        System.out.println("intA: "+intA);
        System.out.println("intB: "+intB);
        System.out.println("arrayA: "+ Arrays.toString(arrayA));
        System.out.println("arrayB: " + Arrays.toString(arrayB));
        System.out.println();

        //change teh second int and the second array
        intB = 2;
        arrayB[0] = 2;

        //print everything again
        System.out.println("after intB = 2; and arrayB[0] = 2;");
        System.out.println("intA: "+intA);
        System.out.println("intB: "+intB);
        System.out.println("arrayA: "+ Arrays.toString(arrayA));
        System.out.println("arrayB: " + Arrays.toString(arrayB));

        UniUtils.printAuthor();
    }
}
