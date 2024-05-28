package LAB06.zad02;

public class Zamowienie {
    public Pozycja pozycje[];
    public int maksRozmiar;

    public Zamowienie() {
        this.maksRozmiar = 10;
        this.pozycje = new Pozycja[10];
    }

    public Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
        this.pozycje = new Pozycja[maksRozmiar];
    }

    public void dodajPozycje(Pozycja pozycja) {
        for(int i = 0; i < maksRozmiar; i++) {
            if (pozycje[i] == null) {
                pozycje[i] = pozycja;
                break;
            }
        }
    }

    public double obliczWartosc() {
        double wartosc = 0;
        for(int i = 0; i < maksRozmiar; i++) {
            if(pozycje[i] != null) {
                wartosc += pozycje[i].obliczWartosc();
            }
        }
        return wartosc;
    }

    @Override
    public String toString() {
        String output = "Zamówienie:\n";
        for (int i = 0; i < maksRozmiar; i++) {
            if (pozycje[i] != null) {
                output += pozycje[i].toString() + "\n";
            }
        }
        output += String.format("\nRazem: %.2f zł\n", obliczWartosc());
        return output;
    }
}
