package LAB04.zad03;

public class Karta {
    public Kolor kolor;
    public Figura figura;

    public Karta(Kolor kolor, Figura figura) {
        this.kolor = kolor;
        this.figura = figura;
    }

    public String toString() {
        return figura + " " + kolor;
    }
}
