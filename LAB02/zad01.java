package LAB02;

import java.util.Scanner;
import java.util.Arrays;

public class zad01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj wielkość tablicy: ");
        int wielkosc = scan.nextInt();
        scan.nextLine();

        char[] tablica = new char[wielkosc];
        for (int i=0;i<wielkosc;i++){
            System.out.print("Podaj znak " + (i+1) + ": ");
            tablica[i] = scan.nextLine().charAt(0);
        }

        System.out.println("Utworzona tablica to: " + Arrays.toString(tablica));
        scan.close();

    }
}
