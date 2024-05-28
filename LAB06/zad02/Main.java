package LAB06.zad02;

public class Main {
    public static void main(String[] args) {
        Zamowienie zamowienie = new Zamowienie();
        zamowienie.dodajPozycje(new Pozycja("Chleb", 2,  2));
        zamowienie.dodajPozycje(new Pozycja("Banany", 1,  6));

        System.out.println(zamowienie);
    }
}
