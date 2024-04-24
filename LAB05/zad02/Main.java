package LAB05.zad02;

public class Main {
    public static void main(String[] args) {
        Bookshop ksiegarnia = new Bookshop("Pilotów 2", 150);
        Bakery piekarnia = new Bakery("Zamkowa 2", 60);

        System.out.println(ksiegarnia.getInformation());
        System.out.println(piekarnia.getInformation());
    }
}
