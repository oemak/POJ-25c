package LAB07.zad01;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int rokUrodzenia;

    public Osoba(String imie, String nazwisko, int rokUrodzenia) throws Exception {
        /* if (imie == null || imie.trim().isEmpty()) {
            throw new Exception("Imię nie może być puste");
        }
        if (nazwisko == null || nazwisko.trim().isEmpty()) {
            throw new Exception("Nazwisko nie może być puste");
        } */
        sprawdzDaneOsoby(imie, nazwisko, rokUrodzenia);
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    @Override
    public String toString() {
        return "Imię: " + imie + " | " + "Nazwisko: " + nazwisko + " | " + "Rok urodzenia: " + rokUrodzenia;
    }

    private void sprawdzDaneOsoby(String imie, String nazwisko, int rokUrodzenia) throws Exception {
        if (imie == null || imie.trim().isEmpty()) {
            throw new Exception("Podano niewłaściwe imię!");
        }
        if (nazwisko == null || nazwisko.trim().isEmpty()) {
            throw new Exception("Podano niewłaściwe nazwisko!");
        }
        if (rokUrodzenia < 1900 || rokUrodzenia > 2020) {
            throw new Exception("Podano niewłaściwy rok urodzenia!");
        }
    }
}
