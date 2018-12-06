package Prog1.Chapter7.Vierecke;

public abstract class Viereck implements Figure {
    protected static final int X = 0;
    protected static final int Y = 1;
    protected double[] a; // [ x, y]
    protected double[] b; // [ x, y]
    protected double[] c; // [ x, y]
    protected double[] d; // [ x, y]
    protected double side1; // a to b
    protected double side2; // b to c
    protected double side3; // c to d
    protected double side4; // d to a

    public Viereck(double[] a, double[] b, double[] c, double[] d) {
        //always
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        side1 = getAbstand(a, b);
        if (c != null) {
            side2 = getAbstand(b, c);
            if (d != null) {
                side3 = getAbstand(c, d);
                side4 = getAbstand(d, a);
            }
        }
    }

    public double getUmfang() {
        return side1 + side2 + side3 + side4;
    }

    public double getFlaeche() {
        double flaeche = 0.0;

        // erstes dreieck
        flaeche += side1 * getHoehe(a, b, c) * 0.5;

        // zweites dreieck
        flaeche += side4 * getHoehe(a, d, c) * 0.5;

        return flaeche;
    }

    protected double getAbstand(double[] a, double[] b) {
        double x = Math.abs(a[X] - b[X]);
        double y = Math.abs(a[Y] - b[Y]);
        return Math.sqrt(x * x + y * y);
    }

    protected double getWinkel(double[] a, double[] b, double[] c) { // berechnet den Winkel bei b
        double sA = getAbstand(b, c);
        double sB = getAbstand(c, a);
        double sC = getAbstand(a, b);
        // cosinus satz
        return Math.acos((sC * sC + sA * sA - sB * sB) / (2 * sC * sA));
    }

    protected double getHoehe(double[] a, double[] b, double[] c) {
        double alpha = getWinkel(a, b, c);
        return Math.sin(alpha) * getAbstand(b, c);
    }

}
