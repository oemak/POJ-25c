package LAB04.zad01;

public class Main {
    public static void main(String[] args) {
        // Przykładowe dane
        Ułamek u1 = new Ułamek(1, 2);
        Ułamek u2 = new Ułamek(1, 3);

        Ułamek uD = u1.dodaj(u2);
        System.out.println("Wynik dodawania: " + uD.licznik + "/" + uD.mianownik);

        Ułamek uO = u1.odejmij(u2);
        System.out.println("Wynik odejmowania: " + uO.licznik + "/" + uO.mianownik);

        Ułamek uM = u1.pomnoz(u2);
        System.out.println("Wynik mnożenia: " + uM.licznik + "/" + uM.mianownik);

        Ułamek uDz = u1.podziel(u2);
        System.out.println("Wynik dzielenia: " + uDz.licznik + "/" + uDz.mianownik);
    }
}
