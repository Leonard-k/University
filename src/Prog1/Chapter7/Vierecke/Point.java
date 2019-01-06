package Prog1.Chapter7.Vierecke;

public class Point {
    // Die Felder können nicht verändert werden (final) daher müssen sie auch
    // nicht umbedingt private sein und können so direkt benutz werden.
    public final double X;
    public final double Y;

    private Point(double x, double y) {
        this.X = x;
        this.Y = y;
    }

    public static Point p(double x, double y) {
        return new Point(x, y);
    }

}
