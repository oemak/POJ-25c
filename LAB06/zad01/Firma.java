package LAB06.zad01;

public class Firma {
    public Pracownik pracownicy[];

    public Firma (Pracownik[] pracownicy) {
        this.pracownicy = pracownicy;
    }

    public double obliczMiesiecznyKosztFirmy() {
        double miesiecznyKoszt = 0;
        for (Pracownik pracownik : pracownicy) {
            miesiecznyKoszt += pracownik.dzienneWynagrodzenie * 20;
        }
        return miesiecznyKoszt;
    }

    public double obliczRocznyKosztFirmy() {
        double rocznyKoszt = 0;
        for (Pracownik pracownik : pracownicy) {
            rocznyKoszt += pracownik.dzienneWynagrodzenie * 240;
        }
        return rocznyKoszt;
    }

    public double obliczKosztFirmy(Czas czas, int krotność) {
        double kosztFirmy = 0;
        int dni = czas.dni * krotność;
        for (Pracownik pracownik : pracownicy) {
            kosztFirmy += pracownik.dzienneWynagrodzenie * dni;
        }
        return kosztFirmy;
    }
}
