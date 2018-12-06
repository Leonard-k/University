package Prog1.Chapter7.Vierecke;

import Prog1.UniUtils;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Scanner;

public class ViereckLauncher {
    public static void main(String[] args) {
        //create points to use later
        double[]
                p00 = new double[]{0, 0}, p10 = new double[]{1, 0}, p20 = new double[]{2, 0}, p30 = new double[]{3, 0},
                p01 = new double[]{0, 1}, p11 = new double[]{1, 1}, p21 = new double[]{2, 1}, p31 = new double[]{3, 1},
                p02 = new double[]{0, 2}, p12 = new double[]{1, 2}, p22 = new double[]{2, 2}, p32 = new double[]{3, 2};

        //create one off all figures
        List<Figure> figures = new ArrayList<>();
        figures.add(new KonvexesViereck(p00, p31, p12, p01));
        figures.add(new Trapez(p00, p30, p21, p11));
        figures.add(new Parallelogramm(p00, p20, p31));
        figures.add(new Rhombus(p10, p31, p12));
        figures.add(new Rechteck(p00, p30, p32));
        figures.add(new Quadrat(p00, p01));

        //print all figures
        String template = "%-45s  Fläche: %5.2f  Umfang: %5.2f";
        for (Figure f : figures) {
            System.out.println(String.format(template, f.getClass().toString(), f.getFlaeche(), f.getUmfang()));
        }



        //user interface:
        Scanner scan = new Scanner(System.in);
        String msg = "Punkte geben Sie wie folgt ein \"x1 y1 x2 y2 xn yn\" ";

        loop:
        while (true) {
            System.out.println("\n");
            System.out.println("Was für ein Viereck möchten Sie berechnen? \n" +
                    "[Konvex: 0] [Trapez: 1] [Para.: 2] [Rhombus: 3] [Rechteck: 4] [Quadrat: 5]");

            int input = scan.nextInt();
            double x1, x2, x3 = 0, x4 = 0, y1, y2, y3 = 0, y4 = 0;
            switch (input) {
                case 0:
                case 1:
                    System.out.println("Bitte geben Sie 4 Punkte in der Rheinfolge A B C D ein.");
                    System.out.println(msg);
                    x1 = scan.nextDouble();
                    y1 = scan.nextDouble();
                    x2 = scan.nextDouble();
                    y2 = scan.nextDouble();
                    x3 = scan.nextDouble();
                    y3 = scan.nextDouble();
                    x4 = scan.nextDouble();
                    y4 = scan.nextDouble();
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("Bitte geben Sie 3 Punkte in der Rheinfolge A B C ein.");
                    System.out.println(msg);
                    x1 = scan.nextDouble();
                    y1 = scan.nextDouble();
                    x2 = scan.nextDouble();
                    y2 = scan.nextDouble();
                    x3 = scan.nextDouble();
                    y3 = scan.nextDouble();
                    break;
                case 5:
                    System.out.println("Bitte geben Sie 2 Punkte ein.");
                    System.out.println(msg);
                    x1 = scan.nextDouble();
                    y1 = scan.nextDouble();
                    x2 = scan.nextDouble();
                    y2 = scan.nextDouble();
                    break;
                default:
                    System.out.println(input + " ist keine Gültige eingabe bitte versuchen Sie es erneut");
                    continue loop;
            }
            double[] d1 = new double[]{x1, y1}, d2 = new double[]{x2, y2}, d3 = new double[]{x3, y3}, d4 = new double[]{x4, y4};

            Figure f = null;
            switch (input) {
                case 0:
                    f = new KonvexesViereck(d1, d2, d3, d4);
                    break;
                case 1:
                    f = new Trapez(d1, d2, d3, d4);
                    break;
                case 2:
                    f = new Parallelogramm(d1, d2, d3);
                    break;
                case 3:
                    f = new Rhombus(d1, d2, d3);
                    break;
                case 4:
                    f = new Rechteck(d1, d2, d3);
                    break;
                case 5:
                    f = new Quadrat(d1, d2);
            }

            System.out.println(String.format(template, f.getClass().toString(), f.getFlaeche(), f.getUmfang()));

            System.out.println("again? [y/n]");
            String s = scan.next();
            if (!s.equals("y")) {
                break loop;
            }
        }

        //print Author
        UniUtils.printAuthor();
    }
}
