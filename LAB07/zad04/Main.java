package LAB07.zad04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = 0, r = 0, s = 0, x = 0, y = 0, z = 0;

        System.out.println("Podaj tekst który chciałbyś przeanalizować:");
        String input = scan.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                x++;
                if (isSamogloska(ch)) {
                    y++;
                } else {
                    z++;
                }
            } else if (Character.isWhitespace(ch)) {
                r++;
            } else if (Character.isDigit(ch)) {
                p++;
            } else {
                s++;
            }
        }

        System.out.println();
        System.out.println("Podany tekst \"" + input + "\" zawiera:");
        System.out.println(x + " liter, w tym " + y + " samogłosek oraz " + z + " spółgłosek");
        System.out.println(r + " białych znaków");
        System.out.println(p + " liczb");
        System.out.println(s + " innych znaków");
    }

    public static boolean isSamogloska(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y';
    }
}
