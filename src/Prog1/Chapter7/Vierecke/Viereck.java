package Prog1.Chapter7.Vierecke;

public class Viereck implements Figure {
    private static final int X = 0;
    private static final int Y = 1;
    private double[] a = new double[2]; // [ x, y]
    private double[] b = new double[2]; // [ x, y]
    private double[] c = new double[2]; // [ x, y]
    private double[] d = new double[2]; // [ x, y]
    private double side1; // a to b
    private double side2; // b to c
    private double side3; // c to d
    private double side4; // d to a

    public Viereck(double ax, double ay, double bx, double by, double cx, double cy, double dx, double dy) {
        this(new double[]{ax, ay}, new double[]{bx, by}, new double[]{cx, cy}, new double[]{dx, dy});
    }

    public Viereck(double[] a, double[] b, double[] c, double[] d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        side1 = getAbstand(a, b);
        side2 = getAbstand(b, c);
        side3 = getAbstand(c, d);
        side4 = getAbstand(d, a);
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

    private double getAbstand(double[] a, double[] b) {
        double x = Math.abs(a[X] - b[X]);
        double y = Math.abs(a[Y] - b[Y]);
        return Math.sqrt(x * x + y * y);
    }

    private double getWinkel(double[] a, double[] b, double[] c) { // berechnet den Winkel bei b
        double sA = getAbstand(b, c);
        double sB = getAbstand(c, a);
        double sC = getAbstand(a, b);
        // cosinus satz
        return Math.acos((sC * sC + sA * sA - sB * sB) / (2 * sC * sA));
    }

    private double getHoehe(double[] a, double[] b, double[] c) {
        double alpha = getWinkel(a, b, c);
        return Math.sin(alpha) * getAbstand(b, c);
    }

}
