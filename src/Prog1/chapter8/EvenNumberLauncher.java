package Prog1.chapter8;

import Prog1.UniUtils;

import java.util.concurrent.TimeUnit;

public class EvenNumberLauncher {
    public static void main(String[] args) {
        EvenNumber n2, n4, n5, n10, n20;
        try {
            // initialize some 'EvenNumber's
            n2 = new EvenNumber(2);
            n4 = new EvenNumber(4);
            n10 = new EvenNumber(10);
            n20 = new EvenNumber(20);

            // print them
            System.out.println(String.format("n2 : %s\nn4 : %s\nn10: %s\nn20: %s", n2, n4, n10, n20));

            //do some sample operations:
            String format = "%-40s = %s";
            System.out.println(String.format(format,"n2.add(n4)" , n2.add(n4)));
            System.out.println(String.format(format,"n2.add(n4).add(n10)" , n2.add(n4).add(n10)));
            System.out.println(String.format(format,"n2.add(n4, n10, n20)" , n2.add(n4, n10, n20)));
            System.out.println(String.format(format,"n2.add(n4, n10, (n4.multiplyWith(n2)))" , n2.add(n4, n10, (n4.multiplyWith(n2)))));
            System.out.println(String.format(format,"n2.multiplyWith(n4, n10, n20)" ,n2.multiplyWith(n4, n10, n20)));


            // try to create an uneven EvenNumber
            System.out.println("\nnew EvenNumber(5):");
            n5 = new EvenNumber(5);
        } catch (NotEvenException e) {
            e.printStackTrace();
        }

        // print Author
        UniUtils.printAuthor();
    }
}
