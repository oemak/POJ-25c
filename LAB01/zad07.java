package LAB01;

import java.util.Scanner;

public class zad07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwsza litere: ");
        String pierwszaS = scan.next().toUpperCase();
        char pierwsza = pierwszaS.charAt(0);
        System.out.println("Podaj druga litere: ");
        String drugaS = scan.next().toUpperCase();
        char druga = drugaS.charAt(0);

        if(pierwsza < druga) {
            System.out.println("Litera " + druga + " występuje później w alfabecie");
        } else if(pierwsza > druga) {
            System.out.println("Litera " + pierwsza + " występuje później w alfabecie");
        } else {
            System.out.println("Podane litery sa takie same :)");
        }
        
    }
}