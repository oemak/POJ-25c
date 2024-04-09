package LAB03.zad05;

import java.util.Scanner;

public class Bankomat {
    public final int ileKont = 10;
    public Konto[] konta;

    public Bankomat() {
        konta = new Konto[ileKont];
        
        for (int i=0; i<ileKont; i++) {
            konta[i] = new Konto(i+1, 100.0);
        }
    }

    public void startBankomat() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an id: ");
            int id = scan.nextInt();

            if (id < 1 || id > ileKont) {
                System.out.println("Entered Wrong ID!");
                continue;
            }

            Konto konto = konta[id-1];
            while (true) {
                System.out.println("Main menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.print("Enter a choice: ");
                int choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("The balance is: " + konto.saldo);
                        System.out.println();
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double ileWyplac = scan.nextDouble();
                        konto.wyplac(ileWyplac);
                        System.out.println();
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        double ileWplac = scan.nextDouble();
                        konto.wplac(ileWplac);
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("Exiting.");
                        System.out.println();
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        System.out.println();
                }

                if (choice == 4) {
                    break;
                }
            }
        }
    }
}
