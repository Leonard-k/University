/**
 * This class shows the examples of implicit and explicit
 * type conversion between the primitive Java types
 * @author  Leonard Kühlke
 * @version 1.1
 */

package Prog1.Chapter3;

import Prog1.UniUtils;

public class TypeConverter {
    public static void main(String[] args) {

        // start value for the  number conversion (implicit)
        Byte b = new Byte("65");
        System.out.println("Start value implicit conversions: " + b);

        // do Conversions
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        //  print conversions
        printConversion(b, s);
        printConversion(s, i);
        printConversion(i, l);
        printConversion(l, f);
        printConversion(f, d);

        // start value for char
        char c = 'A';
        System.out.println("\nStart value char conversion: " + c);
        i = c;

        //print conversion
        System.out.println(
                String.format("Converting %-25s to  %-25s  -->  %-5s ",
                new Character('A').getClass().toString(),
                        new Integer(i).getClass().toString(), i));


        // start value for the  number conversion (explicit)
        d = 256.88;
        System.out.println("\nStart value explicit conversions : " + d);

        // do Conversions
        f = (float) d;
        l = (long) f;
        i = (int) l;
        s = (short) i;
        b = (byte) s;

        //  print conversions
        printConversion(d, f);
        printConversion(f, l);
        printConversion(l, i);
        printConversion(i, s);
        printConversion(s, b);

        // print Author
        UniUtils.printAuthor();
    }

    private static void printConversion(Number fromType, Number toType) {

        System.out.println(
                String.format("Converting %-25s to  %-25s  -->  %-5s ",
                fromType.getClass().toString(),
                        toType.getClass().toString(), toType));

    }
}
