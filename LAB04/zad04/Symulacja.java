package LAB04.zad04;

import java.util.Scanner;

public class Symulacja {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj ilość rzutów monetą: ");
        int ileProb = scan.nextInt();

        int ileO = 0;
        Moneta moneta = new Moneta();
        for (int i = 0; i < ileProb; i++) {
            if (moneta.rzut() == 1) {
                ileO++;
            }
        }

        double szansaO = (double) ileO / (double) ileProb * 100;
        double szansaR = 100 - szansaO;

        System.out.printf("%.2f%% orzeł | %.2f%% reszka dla %d rzutów.", szansaO, szansaR, ileProb);

        scan.close();
    }
}
