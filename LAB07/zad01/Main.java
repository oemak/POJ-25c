package LAB07.zad01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        boolean poprawneDane = false;
        Osoba osoba = null;

        while(!poprawneDane) {
            try {
                System.out.print("Podaj imię: ");
                String imie = scan.nextLine();

                System.out.print("Podaj nazwisko: ");
                String nazwisko = scan.nextLine();

                System.out.print("Podaj rok urodzenia: ");
                int rokUrodzenia = scan.nextInt();
                scan.nextLine();

                osoba = new Osoba(imie, nazwisko, rokUrodzenia);
                poprawneDane = true;
            } catch (Exception e) {
                System.out.println();
                System.err.println(e.getMessage());
                System.out.println();
            }
        }

        System.out.println("\nPomyślnie utworzono użytkownika:");
        System.out.println(osoba);
        System.out.println();

        scan.close();
    }
}
