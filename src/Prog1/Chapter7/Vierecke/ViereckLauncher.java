package Prog1.Chapter7.Vierecke;

public class ViereckLauncher {
    public static void main(String[] args) {
        Viereck v = new Viereck(0, 0, 1, 0, 1, 1, 0, 1);
        System.out.println(v.getUmfang());
        System.out.println(v.getFlaeche());
        Figure v2 = new Viereck(0, 0, 1, 1, 1, 3, 0, 2);
        System.out.println(v2.getUmfang());
        System.out.println(String.format("%f",v2.getFlaeche()));
    }
}
