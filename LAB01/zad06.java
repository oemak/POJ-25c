package LAB01;

import java.util.Scanner;

public class zad06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj numer dnia tygodnia: ");
        int dzien = scan.nextInt();

        String nazwaDnia = "";
        switch(dzien) {
            case 1:
                nazwaDnia = "Poniedzialek";
                break;
            case 2:
                nazwaDnia = "Wtorek";
                break;
            case 3:
                nazwaDnia = "Sroda";
                break;
            case 4:
                nazwaDnia = "Czwartek";
                break;
            case 5:
                nazwaDnia = "Piatek";
                break;
            case 6:
                nazwaDnia = "Sobota";
                break;
            case 7:
                nazwaDnia = "Niedziela";
                break;
            default:
                nazwaDnia = "Podano zly numer!";
        }
        
        System.out.println("Podany dzien tygodnia to: " + nazwaDnia);
    }
}