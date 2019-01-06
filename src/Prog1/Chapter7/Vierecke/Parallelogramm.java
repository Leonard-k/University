package Prog1.Chapter7.Vierecke;

public class Parallelogramm extends Trapez {

    // you only need 3 points to define a parallelogram
    public Parallelogramm(Point a, Point b, Point c) {
        super(a, b, c, null);
    }

    @Override
    public double getUmfang() {
        return side1 + side1 + side2 + side2;
    }

    @Override
    public double getFlaeche() {
        return getHoehe(a, b, c) * side1;
    }
}
