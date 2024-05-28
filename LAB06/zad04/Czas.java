package LAB06.zad04;

public class Czas {
    public int godziny;
    public int minuty;

    Czas(int godziny, int minuty) {
        this.godziny = godziny;
        this.minuty = minuty;
    }

    public String toString() {
        return godziny + "h " + minuty + "min";
    }

    public Czas dodaj(Czas t) {
        int sumaGodzin = this.godziny + t.godziny;
        int sumaMinut = this.minuty + t.minuty;
        if(sumaMinut >= 60) {
            sumaMinut -= 60;
            sumaGodzin++;
        }
        return new Czas(sumaGodzin, sumaMinut);
    }

    public Czas odejmij(Czas t) {
        int roznicaGodzin = this.godziny - t.godziny;
        int roznicaMinut = this.minuty - t.minuty;
        if(roznicaMinut < 0) {
            roznicaMinut = Math.abs(roznicaMinut);
            roznicaGodzin--;
        }
        return new Czas(roznicaGodzin, roznicaMinut);
    }

    public Czas pomnoz(int krotnosc) {
        int iloczynGodzin = this.godziny * krotnosc;
        int iloczynMinut = this.minuty * krotnosc;
        while (iloczynMinut >= 60) {
            iloczynMinut -= 60;
            iloczynGodzin++;
        }
        return new Czas(iloczynGodzin, iloczynMinut);
    }

    public static void main(String[] args) {
        Czas czas = new Czas(29, 24);
        Czas czas2 = new Czas(10, 54);

        System.out.println("Czas 1: " + czas);
        System.out.println("Czas 2: " + czas2);
        System.out.println("Suma: " + czas.dodaj(czas2));
        System.out.println("Różnica: " + czas.odejmij(czas2));
        System.out.println("Iloczyn czasu 1 (krotność 10): " + czas.pomnoz(10));
    }
}
