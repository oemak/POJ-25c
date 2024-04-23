package LAB04.zad05;

public class Wyscig {
    public static void main(String[] args) {
        Zawodnik zawodnik1 = new Zawodnik("Igor", 5, 15);
        Zawodnik zawodnik2 = new Zawodnik("Kuba", 7, 16);
        Zawodnik zawodnik3 = new Zawodnik("Mateusz", 3, 14);

        System.out.println();
        System.out.println("Zaczynamy wyścig!");
        System.out.println();

        Zawodnik winner = null;
        while(true) {
            zawodnik1.biegnij();
            zawodnik2.biegnij();
            zawodnik3.biegnij();
            System.out.println();

            if(zawodnik1.dystansTotal >= 50) {
                winner = zawodnik1;
                break;
            } else if(zawodnik2.dystansTotal >= 50) {
                winner = zawodnik2;
                break;
            } else if(zawodnik3.dystansTotal >= 50) {
                winner = zawodnik3;
                break;
            }
        }

        System.out.println();
        System.out.println("Zwycięzcą wyścigu na 50km zostaje " + winner.imie + " który przebiegł jako pierwszy aż " + winner.dystansTotal + "km!");

    }
}
