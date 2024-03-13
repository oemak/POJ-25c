package LAB01;

import java.util.Scanner;
import java.util.Random;

public class zad10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int programIn = random.nextInt(3);

        System.out.println("Wybierz: 0 - kamien, 1 - papier, 2 - nozyce: ");
        int userIn = scan.nextInt();

        String programResult = "";
        switch(programIn){
            case 0:
                programResult = "kamien";
                break;
            case 1:
                programResult = "papier";
                break;
            case 2:
                programResult = "nozyce";
                break;
        }

        System.out.println("Program wybral: " + programResult);
        if(userIn == 0 && programIn == 2 || userIn == 2 && programIn == 1 || userIn == 1 && programIn == 0) {
            System.out.println("Wygrales :)");
        } else if(userIn == programIn) {
            System.out.println("Remis :/");
        } else {
            System.out.println("Przegrales :(");
        }
    }
}
