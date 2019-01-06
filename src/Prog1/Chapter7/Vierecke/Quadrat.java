package Prog1.Chapter7.Vierecke;

public class Quadrat extends Rhombus {
    // you only need 2 points to define a square
    public Quadrat(Point a, Point b) {
        super(a, b,null);
    }

    @Override
    public double getFlaeche() {
        return side1 * side1;
    }
}
