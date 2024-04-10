package LAB03.zad06;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Gracz gracz = new Gracz();

        System.out.println("Wybierz broń (1-3):");
        System.out.println("1. Kamienny miecz");
        System.out.println("2. Żelazny miecz");
        System.out.println("3. Diamentowy miecz");
        int weaponChoice = scan.nextInt();

        switch(weaponChoice) {
            case 1:
                gracz.weapon = "Kamienny miecz";
                break;
            case 2:
                gracz.weapon = "Żelazny miecz";
                break;
            case 3:
                gracz.weapon = "Diamentowy miecz";
                break;
            default:
                System.out.println("Nieprawidłowy wybór! Spróbuj ponownie.");
        }

        System.out.println();
        System.out.println("Wybierz zbroję (1-3):");
        System.out.println("1. Kolczasta zbroja");
        System.out.println("2. Żelazna zbroja");
        System.out.println("3. Diamentowa zbroja");
        int armorChoice = scan.nextInt();

        switch(armorChoice) {
            case 1:
                gracz.armor = "Kolczasta zbroja";
                break;
            case 2:
                gracz.armor = "Żelazna zbroja";
                break;
            case 3:
                gracz.armor = "Diamentowa zbroja";
                break;
            default:
                System.out.println("Nieprawidłowy wybór! Spróbuj ponownie.");
        }

        System.out.println();
        System.out.println("Wybierz przeciwnika (1-3):");
        System.out.println("1. Szkielet (Poziom trudności: łatwy)");
        System.out.println("2. Zombie (Poziom trudności: średni)");
        System.out.println("3. Troll (Poziom trudności: trudny)");
        int enemyChoice = scan.nextInt();

        Przeciwnik przeciwnik = null;
        switch(enemyChoice) {
            case 1:
                przeciwnik = new Przeciwnik(100, "Kamienny miecz", "Kolczasta zbroja");
                break;
            case 2:
                przeciwnik = new Przeciwnik(100, "Żelazny miecz", "Żelazna zbroja");
                break;
            case 3:
                przeciwnik = new Przeciwnik(100, "Diamentowy miecz", "Diamentowa zbroja");
                break;
            default:
                System.out.println("Nieprawidłowy wybór! Spróbuj ponownie.");
        }

        System.out.println();
        System.out.println("Walka się rozpoczyna!");
        System.out.println();

        while (gracz.HP > 0 && przeciwnik.HP > 0) {
            int przeciwnikHPbefore = przeciwnik.HP; 
            gracz.attack(przeciwnik);
            int przeciwnikHPafter = przeciwnik.HP;

            System.out.println("Zaatakowano przeciwnika za " + (przeciwnikHPbefore - przeciwnikHPafter) + " obrażeń. HP przeciwnika: " + przeciwnik.HP);

            try { //Nie miałem pojęcia jak inaczej to zrobić więc posłużyłem się w tym miejscu kopią z internetu
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (przeciwnik.HP > 0) {
                int graczHPbefore = gracz.HP;
                przeciwnik.attack(gracz);
                int graczHPafter = gracz.HP;

                System.out.println("Otrzymano " + (graczHPbefore - graczHPafter) + " obrażeń. HP gracza: " + gracz.HP);
                try { //Nie miałem pojęcia jak inaczej to zrobić więc posłużyłem się w tym miejscu kopią z internetu
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }

        if (gracz.HP <= 0) {
            System.out.println("Przegrałeś :(");
        } else {
            System.out.println("Wygrałeś! :)");
        }

        scan.close();
    }
}
