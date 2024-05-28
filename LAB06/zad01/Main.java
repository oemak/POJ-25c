package LAB06.zad01;

public class Main {
    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik("John", "Doe", 150);
        Pracownik pracownik2 = new Pracownik("Jane", "Doe", 100);
        Pracownik[] pracownicy = {pracownik1, pracownik2};

        Firma firma = new Firma(pracownicy);

        System.out.println("Miesięczny koszt firmy: " + firma.obliczMiesiecznyKosztFirmy() + " PLN");
        System.out.println("Roczny koszt firmy: " + firma.obliczRocznyKosztFirmy() + " PLN");
        System.out.println("Koszt firmy przez 3 miesiące: " + firma.obliczKosztFirmy(Czas.MIESIAC, 3) + " PLN");
        System.out.println("Koszt firmy przez 10 dni: " + firma.obliczKosztFirmy(Czas.DZIEN, 10) + " PLN");
    }
}
