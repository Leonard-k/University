package Prog1.Chapter7.Vierecke;

import Prog1.UniUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Prog1.Chapter7.Vierecke.Point.p;

public class ViereckLauncher {
    public static void main(String[] args) {

        //create one off all figures
        List<Figure> figures = new ArrayList<>();
        figures.add(new KonvexesViereck(p(0,0), p(3,1), p(1,2), p(0,1)));
        figures.add(new Trapez(p(0,0), p(3,0), p(2,1), p(1,1)));
        figures.add(new Parallelogramm(p(0,0), p(2,0), p(3,1)));
        figures.add(new Rhombus(p(1,0), p(3,1), p(1,2)));
        figures.add(new Rechteck(p(0,0), p(3,0), p(3,2)));
        figures.add(new Quadrat(p(0,0), p(0,1)));

        //print all figures
        System.out.println("Beispiele:");
        String template = "%-45s  Fläche: %5.2f  Umfang: %5.2f Input: %5s";
        for (Figure f : figures) {
            System.out.println(String.format(template, f.getClass().toString(), f.getFlaeche(), f.getUmfang(), f.toString()));
        }

        //user interface:
        Scanner scan = new Scanner(System.in);
        String msg = "Punkte geben Sie wie folgt ein \"x1 y1 x2 y2 xn yn\" ";

        loop:
        while (true) {
            System.out.println("\n");
            // danach fragen welches viereck berechnet werden soll
            // und dementsperechend viele punkte abfragen
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

            Point p1 = p(x1, y1), p2 = p(x2, y2), p3 = p(x3, y3), p4 = p(x4, y4);

            // ein object der gerfragten figur erstellen
            Figure f = null;
            switch (input) {
                case 0:
                    f = new KonvexesViereck(p1, p2, p3, p4);
                    break;
                case 1:
                    f = new Trapez(p1, p2, p3, p4);
                    break;
                case 2:
                    f = new Parallelogramm(p1, p2, p3);
                    break;
                case 3:
                    f = new Rhombus(p1, p2, p3);
                    break;
                case 4:
                    f = new Rechteck(p1, p2, p3);
                    break;
                case 5:
                    f = new Quadrat(p1, p2);
            }

            // die Ergebnisse Ausgeben
            System.out.println(String.format(template, f.getClass().toString(), f.getFlaeche(), f.getUmfang(), f.toString()));

            // nach wiederholung fragen
            System.out.println("again? [y/n]");
            String s = scan.next();
            if (!s.equals("y")) {
                break loop;
            }
        }

        // print Author
        UniUtils.printAuthor();
    }
}
