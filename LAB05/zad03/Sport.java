package LAB05.zad03;

public class Sport extends Car {
    public int maxSpeed;

    public Sport(String kolor, String marka, int maxSpeed) {
        super(kolor, marka);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Maksymalna prędkość: " + maxSpeed + "km/h";
    }
}
