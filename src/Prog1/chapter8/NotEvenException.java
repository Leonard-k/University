package Prog1.chapter8;

public class NotEvenException extends Exception {
    private static String msg = "The Number %d is not even";

    public NotEvenException(int i) {
        super(String.format(msg, i));
    }
}