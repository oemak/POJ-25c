package LAB06.zad02;

public class Pozycja {
    public String nazwaTowaru;
    public int iloscSztuk;
    public double cenaSztuki;

    public Pozycja(String nazwaTowaru, int iloscSztuk, double cenaSztuki) {
        this.nazwaTowaru = nazwaTowaru;
        this.iloscSztuk = iloscSztuk;
        this.cenaSztuki = cenaSztuki;
    }

    public double obliczWartosc() {
        return cenaSztuki * iloscSztuk;
    }

    @Override
    public String toString() {
        return String.format("%-10s %.2f zł   %-8s %.2f zł", nazwaTowaru, cenaSztuki, iloscSztuk + " szt.", obliczWartosc());

    }
}
