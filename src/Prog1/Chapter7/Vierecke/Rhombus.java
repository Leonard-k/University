package Prog1.Chapter7.Vierecke;

public class Rhombus extends Parallelogramm {

    public Rhombus(Point a, Point b, Point c) {
        super(a, b, c);
    }

    @Override
    public double getUmfang() {
        return side1 * 4;
    }
}
