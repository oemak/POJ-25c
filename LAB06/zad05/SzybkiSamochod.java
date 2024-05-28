package LAB06.zad05;

public class SzybkiSamochod extends Samochod {

    public SzybkiSamochod(String marka, String kolor, int rocznik) {
        super(marka, kolor, rocznik);
    }

    @Override
    public void przyspiesz() {
        predkosc += 20;
        if (predkosc > 200) {
            predkosc = 200;
        }
    }

}
