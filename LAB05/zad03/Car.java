package LAB05.zad03;

public class Car {
    public String kolor;
    public String marka;

    public Car(String kolor, String marka) {
        this.kolor = kolor;
        this.marka = marka;
    }

    public String getInfo() {
        return "Marka: " + marka + " | Kolor: " + kolor;
    }
}
