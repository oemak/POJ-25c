package LAB03.zad05;

public class Konto {
    public int id;
    public double saldo;

    public Konto(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public void wplac(double kwota) {
        saldo += kwota;
    }

    public void wyplac(double kwota) {
        if (saldo >= kwota) {
            saldo -= kwota;
        } else {
            System.out.println("Nie masz wystarczającej ilości środków na koncie");
        }
    }
}
