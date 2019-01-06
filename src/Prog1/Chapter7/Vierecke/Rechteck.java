package Prog1.Chapter7.Vierecke;

public class Rechteck extends Parallelogramm {

    public Rechteck(Point a, Point b, Point c) {
        super(a, b, c);
    }

    @Override
    public double getFlaeche() {
        return side1 * side2;
    }
}
