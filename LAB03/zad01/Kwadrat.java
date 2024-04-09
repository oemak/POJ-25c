package LAB03.zad01;

public class Kwadrat {

    public double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    public double obliczObwod() {
        return bok * 4;
    }

    public double obliczPole() {
        return bok * bok;
    }

}
