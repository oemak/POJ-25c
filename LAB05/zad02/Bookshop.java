package LAB05.zad02;

import java.util.Arrays;

public class Bookshop extends Shop {
    public String[] products;

    public Bookshop(String address, int size) {
        super(address, size);
        this.products = new String[] {"Książka1", "Książka2", "Książka3"};
    }

    @Override
    public String getInformation() {
        return super.getInformation() + " | Produkty: " + Arrays.toString(products);
    }
}
