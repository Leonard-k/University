package Prog1.Chapter7.Vierecke;

public class Rechteck extends Parallelogramm {

    public Rechteck(double[] a, double[] b, double[] c) {
        super(a, b, c);
    }

    @Override
    public double getFlaeche() {
        return side1 * side2;
    }
}
