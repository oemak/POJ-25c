package LAB04.zad01;

public class Ułamek {
    public int licznik;
    public int mianownik;

    public Ułamek(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
    }

    public static int NWD(int a, int b) {
        while (a % b != 0) {
            int bb = b;
            b = a % b;
            a = bb;
        }
        return b;
    }

    public static int NWW(int a, int b) {
        return (a * b) / NWD(a, b); 
    }

    public Ułamek dodaj(Ułamek b) {
        int wspolnyMianownik = NWW(this.mianownik, b.mianownik);

        int nowyLicznik1 = this.licznik * (wspolnyMianownik / this.mianownik);
        int nowyLicznik2 = b.licznik * (wspolnyMianownik / b.mianownik);
        int dodanyLicznik = nowyLicznik1 + nowyLicznik2;

        return new Ułamek(dodanyLicznik, wspolnyMianownik);
    }

    public Ułamek odejmij(Ułamek b) {
        int wspolnyMianownik = NWW(this.mianownik, b.mianownik);

        int nowyLicznik1 = this.licznik * (wspolnyMianownik / this.mianownik);
        int nowyLicznik2 = b.licznik * (wspolnyMianownik / b.mianownik);
        int odjetyLicznik = nowyLicznik1 - nowyLicznik2;

        return new Ułamek(odjetyLicznik, wspolnyMianownik);
    } 

    public Ułamek pomnoz(Ułamek b) {
        return new Ułamek(this.licznik * b.licznik, this.mianownik * b.mianownik);
    }

    public Ułamek podziel(Ułamek b) {
        return new Ułamek(this.licznik * b.mianownik, this.mianownik * b.licznik);
    }
}
