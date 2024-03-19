package LAB02;

import java.util.Scanner;
import java.util.Arrays;

public class zad02 {
    private static int Najmniejszy(int[] t) {
        int min = t[0];
        for(int i = 1; i<t.length; i++) {
            if(t[i] < min) {
                min = t[i];
            }
        }
        return min;
    }

    private static int Najwiekszy(int[] t) {
        int max = t[0];
        for(int i = 1; i<t.length; i++) {
            if(t[i] > max) {
                max = t[i];
            }
        }
        return max;
    }

    private static int Suma(int[] t) {
        int s = 0;
        for(int i = 0; i<t.length; i++) {
            s += t[i];
        }
        return s;
    }

    private static double Srednia(int[] t) {
        double sr = 0;
        for(int i = 0; i<t.length; i++) {
            sr += t[i];
        }
        sr = sr/t.length;
        return sr;
    }

    private static double Mediana(int[] t) {
        int med = 0;
        if(t.length % 2 == 0) {
            med = (t[t.length / 2] + t[t.length / 2 - 1]) / 2;
        } else {
            med = t[t.length / 2];
        }
        return med;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj wielkość tablicy: ");
        int wielkosc = scan.nextInt();
        scan.nextLine();
        int[] tablica = new int[wielkosc];

        System.out.print("Podaj pierwszy element: ");
        tablica[0] = scan.nextInt();
        scan.nextLine();

        int x = tablica[0];
        for(int i=1;i<wielkosc;i++) {
            if(x % 2 == 0) {
                x += 2;
                tablica[i] = x;
            } else {
                x += 1;
                tablica[i] = x;
            }
        }
        System.out.println("\nUtworzona tablica to: " + Arrays.toString(tablica));
        System.out.println("\nStatystyki utworzonej tablicy: ");
        System.out.println("Najmniejszy element tablicy: " + Najmniejszy(tablica));
        System.out.println("Największy element tablicy: " + Najwiekszy(tablica));
        System.out.println("Suma elementów tablicy: " + Suma(tablica));
        System.out.println("Średnia elementów tablicy: " + Srednia(tablica));
        System.out.println("Mediana elementów tablicy: " + Mediana(tablica));

        scan.close();
    }
}
