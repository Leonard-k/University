package Prog1.Chapter7.Vierecke;

public class Rhombus extends Parallelogramm {

    public Rhombus(double[] a, double[] b, double[] c) {
        super(a, b, c);
    }

    @Override
    public double getUmfang() {
        return side1 * 4;
    }
}
