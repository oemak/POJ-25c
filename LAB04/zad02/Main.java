package LAB04.zad02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("--- Zgadnij Liczbę ---");
        System.out.print("Podaj początek zakresu liczb: ");
        int poczZakres = scan.nextInt();
        System.out.print("Podaj koniec zakresu liczb: ");
        int konZakres = scan.nextInt();

        Gra gra = new Gra(poczZakres, konZakres);

        System.out.println("Zaczynamy grę!");

        boolean trafionyLos = false;
        while (!trafionyLos) {
            System.out.print("Podaj liczbę: ");
            int traf = scan.nextInt();
            trafionyLos = gra.sprawdz(traf);
        }

        scan.close();
    }
}
