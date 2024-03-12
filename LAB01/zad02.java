package LAB01;

import java.util.Scanner;

public class zad02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double input = 0;
        System.out.println("Podaj stopnie Celsjusza:");

        input = scan.nextDouble();
        double fahr = ((9.0/5.0) * input) + 32;

        System.out.printf("%.2f stopnie Celsjusza to %.2f F.", input, fahr);
    }
}