package Prog1.Chapter6;
        import Prog1.UniUtils;

public class Task1 {
    public static void main(String[] args) {

        //print numbers from 0 to 9 with a while loop
        System.out.println("print numbers from 0 to 9 with a while loop:");

        int i = 0;
        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\n");

        //print numbers from 0 to 9 with a do-while loop
        System.out.println("print numbers from 0 to 9 with a do-while loop:");

        i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 10);

        System.out.println();
        UniUtils.printAuthor();
    }
}
