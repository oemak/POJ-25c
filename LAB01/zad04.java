package LAB01;

import java.util.Scanner;

public class zad04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe studentow:");
        int numStudent = scan.nextInt();
        scan.nextLine();

        String najS = "";
        int najP = 0;
        for(int i=0; i<numStudent; i++) {
            System.out.println("Podaj imie studenta " + (i+1) + ": ");
            String nazwa = scan.nextLine();
            System.out.println("Podaj liczbe punktow studenta " + (i+1) + ": ");
            int pkt = scan.nextInt();
            scan.nextLine();

            if(najP < pkt){
                najS = nazwa;
                najP = pkt;
            }
        }

        System.out.println("\nNajlepszy student: " + najS);
        System.out.println("Ilosc jego punktow: " + najP);
    }
}