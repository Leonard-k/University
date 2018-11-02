/**
 * This class implements a method that can print the
 * corresponding ASCII characters for a given integer
 * that represents 4 bytes.
 * it's main method also executes the method for the given integer
 *
 * @author Leonard Kühlke
 * @version 1.1
 */
package Prog1.Chapter3;

import Prog1.UniUtils;

public class ACSIIConverter {
    public static void main(String[] args) {
        // input value
        int i = 757935403;

        // call method that prints the ASCII values
        printIntAsASCII(i);

        //print author
        UniUtils.printAuthor();
    }

    /**
     * This method is used to print the ASCII
     * representation of an 4 byte Integer
     * to standard output.
     *
     * @param i This is the given integer who's
     *          ASCII representation will be printed
     * @return nothing
     */
    public static void printIntAsASCII(int i) {

        // go 4 times for 4 bytes
        for (int j = 0; j < 4; j++) {

            // print the next byte
            System.out.print((char) ((byte) i));

            // get to the next byte
            i /= 256;
        }
    }
}
