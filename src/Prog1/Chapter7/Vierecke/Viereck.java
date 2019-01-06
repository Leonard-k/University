package Prog1.Chapter7.Vierecke;

public abstract class Viereck implements Figure {
    protected Point a;
    protected Point b;
    protected Point c;
    protected Point d;
    protected double side1; // a to b
    protected double side2; // b to c
    protected double side3; // c to d
    protected double side4; // d to a

    public Viereck(Point a, Point b, Point c, Point d) {

        // initialize always
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        side1 = getAbstand(a, b);

        // initialize only when possible/needed
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

    protected double getAbstand(Point a, Point b) {
        double x = Math.abs(a.X - b.X);
        double y = Math.abs(a.Y - b.Y);
        return Math.sqrt(x * x + y * y);
    }

    // berechnet den Winkel bei b
    protected double getWinkel(Point a, Point b, Point c) {
        double sA = getAbstand(b, c);
        double sB = getAbstand(c, a);
        double sC = getAbstand(a, b);
        // cosinus satz
        return Math.acos((sC * sC + sA * sA - sB * sB) / (2 * sC * sA));
    }

    protected double getHoehe(Point a, Point b, Point c) {
        double alpha = getWinkel(a, b, c);
        return Math.sin(alpha) * getAbstand(b, c);
    }

    @Override
    public String toString() {
        return String.format("[%s,%s,%s,%s]", PointToStr(a), PointToStr(b), PointToStr(c), PointToStr(d));
    }

    private String PointToStr(Point point) {
        if (point == null) {
            return "(---)";
        }
        // runden der kommazahlen damit man die punkte besser lesen kann
        // dies beinflusst nur die ausgabe nicht die Berechnung
        return String.format("(%1.0f/%1.0f)", point.X, point.Y);
    }
}
