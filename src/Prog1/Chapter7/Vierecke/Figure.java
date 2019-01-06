package Prog1.Chapter7.Vierecke;

public interface Figure {
    // wird genutz damit alle vierecke einen gemeinsamen typ haben der
    // auch noch sinnvoll für andere typen wie kreise oder dreiecke wäre
    public abstract double getUmfang();
    public abstract double getFlaeche();
}
