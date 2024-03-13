package LAB01;

import java.util.Scanner;

public class zad09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj współrzędne x1 oraz y1 punktu 1:");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.println("Podaj współrzędne x2 oraz y2 punktu 2:");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        double len = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("Odleglosc miedzy podanymi punktami to: " + len);
    }
}
