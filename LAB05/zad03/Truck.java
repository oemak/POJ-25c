package LAB05.zad03;

public class Truck extends Car{
    public int maxLadunek;

    public Truck(String kolor, String marka, int maxLadunek) {
        super(kolor, marka);
        this.maxLadunek = maxLadunek;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Maksymalny ładunek: " + maxLadunek + "t";
    }
}
