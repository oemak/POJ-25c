package LAB07.zad05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lokal {
    private String nazwaLokalu;
    private String miejscowosc;
    private String kodPocztowy;
    private String ulica;
    private int numerDomu;
    private int numerLokalu;

    public Lokal(String nazwaLokalu, String adres) throws Exception {
        this.nazwaLokalu = nazwaLokalu;

        String pattern = "(.+)\\s(\\d+)(?:/(\\d+))?,\\s(\\d{2}-\\d{3})\\s(.+)";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(adres);

        if (m.matches()) {
            this.ulica = m.group(1);
            this.numerDomu = Integer.parseInt(m.group(2));
            if (m.group(3) != null) {
                this.numerLokalu = Integer.parseInt(m.group(3));
            } else numerLokalu = 0;
            this.kodPocztowy = m.group(4);
            this.miejscowosc = m.group(5);
        } else {
            throw new Exception("Adres podano w niepoprawnym formacie!");
        }
    }

    @Override
    public String toString() {
        return nazwaLokalu + 
                "\nMiasto: " + miejscowosc + 
                "\nUlica: " + ulica + 
                "\nNumer domu/lokalu: " + (numerLokalu != 0 ? numerDomu + "/" + numerLokalu : numerDomu) +
                "\nKod pocztowy: " + kodPocztowy;
    }


    public static void main(String[] args) throws Exception {
        // Format adresu: "ulica numerDomu/numerLokalu (numerLokalu opcjonalnie), kodPocztowy miasto"
        try {
            Lokal lokal = new Lokal("Mąka i Kawa", "Jana Kilińskiego 4, 80-452 Gdańsk");
            System.out.println(lokal);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
