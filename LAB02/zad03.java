package LAB02;

import java.util.Scanner;
import java.util.Arrays;

public class zad03 {
    public static int[] SumaT(int[] t1, int[] t2) {
        int[] sumaT = new int[t1.length];
        if(t1.length != t2.length) {
            return new int[0];
        } else {
            for(int i = 0; i<t1.length; i++) {
                sumaT[i] = t1[i] + t2[i];
            }
            return sumaT;
        }
    }

    public static void main(String[] args) {
        /* Interaktywna wersja programu

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj wielkość tablicy 1: ");
        int wielkosc1 = scan.nextInt();
        scan.nextLine();

        int[] tablica1 = new int[wielkosc1];
        for (int i=0;i<wielkosc1;i++){
            System.out.print("Podaj liczbę " + (i+1) + " tablicy 1: ");
            tablica1[i] = scan.nextInt();
        }

        System.out.print("\nPodaj wielkość tablicy 2: ");
        int wielkosc2 = scan.nextInt();
        scan.nextLine();

        int[] tablica2 = new int[wielkosc2];
        for (int i=0;i<wielkosc2;i++){
            System.out.print("Podaj liczbę " + (i+1) + " tablicy 2: ");
            tablica2[i] = scan.nextInt();
        }
        */

        int[] tablica1 = {1,2,3};
        int[] tablica2 = {4,5,6};

        System.out.println("\nTablica będąca sumą podanych tablic: " + Arrays.toString(SumaT(tablica1, tablica2)));

        //scan.close();

    }
}
