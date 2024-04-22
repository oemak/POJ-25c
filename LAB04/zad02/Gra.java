package LAB04.zad02;

import java.util.Random;

public class Gra {
    public int poczZakres;
    public int konZakres;
    public int los;
    public int proba = 0;
    public int maxProb = 5;

    public void losuj() {
        Random random = new Random();
        los = random.nextInt(konZakres - poczZakres + 1) + poczZakres;
    }

    public Gra(int poczZakres, int konZakres) {
        this.poczZakres = poczZakres;
        this.konZakres = konZakres;
        losuj();
    }

    public boolean sprawdz(int liczba) {
        proba++;
        if(proba == maxProb) {
            System.out.println("Przegrałeś! Prawidłowa liczba to: " + los);
            return true;
        }

        if (liczba == los) {
            System.out.println("Zgadłeś, gg!");
            return true;
        } else if (liczba < los) {
            System.out.println("Za mała liczba, próbuj dalej");
            return false;
        } else {
            System.out.println("Za duża liczba, próbuj dalej");
            return false;
        }
    }
}
