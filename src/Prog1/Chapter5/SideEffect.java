package Prog1.Chapter5;
        import Prog1.UniUtils;

public class SideEffect {

    // counts how often triple was called
    private static int counter = 0;

    public static void main(String[] args) {

        int i = 1;
        System.out.println("      i: " + i);
        System.out.println("counter: " + counter);

        i = triple(i);
        i = triple(i);

        System.out.println("      i: " + i);
        System.out.println("counter: " + counter);

        UniUtils.printAuthor();
    }

    // returns the tripled value of i
    // also as side effect increments the counter
    private static int triple(int i) {
        counter++;
        return i * 3;
    }
}
