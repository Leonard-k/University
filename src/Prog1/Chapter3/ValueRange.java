/**
 * This class shows the Value range
 * of Javas primitive types
 * @author  Leonard Kühlke
 * @version 1.1
 */
package Prog1.Chapter3;
import Prog1.UniUtils;

import static java.lang.System.*;
import static java.lang.String.format;

public class ValueRange {
    public static void main(String[] args) {

        // define the look of the output
        String p = "%-10s has a Value range from: ";
        String patternD = p + " %25d to %25d ";
        String patternF = p + " %25e to %25e ";
        String patternS = p + " %25s to %25s ";

        // print value ranges
        out.println(format(patternD, "byte", Byte.MIN_VALUE, Byte.MAX_VALUE));
        out.println(format(patternD, "short", Short.MIN_VALUE, Short.MAX_VALUE));
        out.println(format(patternD, "int", Integer.MIN_VALUE, Integer.MAX_VALUE));
        out.println(format(patternD, "long", Long.MIN_VALUE, Long.MAX_VALUE));
        out.println(format(patternD, "char", 0, (int) Math.pow(2, 16) - 1));
        out.println(format(patternF, "float", Float.MIN_VALUE, Float.MAX_VALUE));
        out.println(format(patternF, "double", Double.MIN_VALUE, Double.MAX_VALUE));
        out.println(format(patternS, "double", Boolean.TRUE, Boolean.FALSE));

        UniUtils.printAuthor();
    }
}
