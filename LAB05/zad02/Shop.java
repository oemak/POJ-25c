package LAB05.zad02;

public class Shop {
    public String address;
    public int size;

    public Shop(String address, int size) {
        this.address = address;
        this.size = size;
    }

    public String getInformation() {
        return "Adres: " + address + " | Rozmiar lokalu: " + size + "m2";
    }
}
