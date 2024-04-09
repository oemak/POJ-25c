package LAB03.zad02;

import java.lang.Math;

public class Punkt {
    public double x;
    public double y;

    public Punkt() {
        this.x = 0;
        this.y = 0;
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double obliczOdleglosc(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double obliczOdleglosc(Punkt innyPunkt) {
        return Math.sqrt(Math.pow(this.x - innyPunkt.x, 2) + Math.pow(this.y - innyPunkt.y, 2));
    }
}
