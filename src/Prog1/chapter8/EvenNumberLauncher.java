package Prog1.chapter8;

public class EvenNumberLauncher {
    public static void main(String[] args) {
        EvenNumber n, n2, n3, n4, n5;
        try {
            n = new EvenNumber(2);
            n2 = new EvenNumber(4);
            n3 = new EvenNumber(10);
            n4 = new EvenNumber(20);

            System.out.println(n.add(n2).getInt());
            System.out.println(n.add(n2).add(n3).getInt());
            System.out.println(n.add(n2, n3, n4).getInt());
            System.out.println(n.multiplyWith(n2).getInt());
            System.out.println(n.multiplyWith(n2, n3, n4).getInt());

            n5 = new EvenNumber(5);
        } catch (NotEvenException e) {
            e.printStackTrace();
        }


    }
}
