package LAB04.zad03;

public class Main {
    public static void main(String[] args) {
        for (Kolor kolor : Kolor.values()) {
            for (Figura figura : Figura.values()) {
                Karta karta = new Karta(kolor, figura);
                System.out.println(karta);
            }
        }
    }
}
