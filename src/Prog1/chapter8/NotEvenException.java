package Prog1.chapter8;

public class NotEvenException extends Exception {
    private static final String MSG = "The Number %d is not even";

    public NotEvenException(int i) {
        super(String.format(MSG, i));
    }
}