package LAB06.zad05;

import java.util.Objects;

public class Samochod {
    public int predkosc;
    public String kolor;
    public String marka;
    public int rocznik;

    public Samochod(String marka, String kolor, int rocznik) {
        this.predkosc = 0;
        this.marka = marka;
        this.kolor = kolor;
        this.rocznik = rocznik;
    }

    public void przyspiesz() {
        predkosc += 20;
        if (predkosc > 140) {
            predkosc = 140;
        }
    }

    @Override
    public String toString() {
        return kolor + " " + marka + " rocznik " + rocznik;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if(o == null || getClass() != o.getClass()) {
            return false;
        }
        Samochod samochod = (Samochod) o;
        return Objects.equals(kolor, samochod.kolor) && Objects.equals(marka, samochod.marka) && Objects.equals(rocznik, samochod.rocznik);
    }
}
