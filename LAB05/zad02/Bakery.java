package LAB05.zad02;

import java.util.Arrays;

public class Bakery extends Shop {
    public String[] products;

    public Bakery(String address, int size) {
        super(address, size);
        this.products = new String[] {"Bułka", "Chleb", "Drożdzówka"};
    }

    @Override
    public String getInformation() {
        return super.getInformation() + " | Produkty: " + Arrays.toString(products);
    }
}
