package LAB08.zad05;

import java.time.LocalDate;

public class LataPrzestepne {
    public static void main(String[] args) {
        int obecnyRok = LocalDate.now().getYear();
        int ilePrzestepnych = 0;

        while (ilePrzestepnych < 100) {
            if (jestPrzestepny(obecnyRok)) {
                System.out.println(obecnyRok);
                ilePrzestepnych++;
            }
            obecnyRok++;
        }
    }

    private static boolean jestPrzestepny(int rok) {
        return (rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0);
    }
}
