package LAB01;

import java.util.Scanner;

public class zad05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dlugosc boku A:");
        int A = scan.nextInt();
        System.out.println("Podaj dlugosc boku B:");
        int B = scan.nextInt();
        System.out.println("Podaj dlugosc boku C:");
        int C = scan.nextInt();

        if(A+B > C && A+C > B && B+C > A) {
            System.out.println("Trojkat jest prawidlowy");
        } else {
            System.out.println("Trojkat nie jest prawidlowy");
        }

        // W poleceniu nie jest sprecyzowane czy trzeba wykorzystać boolean przy output'cie dlatego zrobiłem to w taki sposób dla przejrzystości
    }
}