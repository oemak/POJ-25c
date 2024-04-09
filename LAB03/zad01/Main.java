package LAB03.zad01;

public class Main {
    public static void main(String[] args) {
        Kwadrat przykladowyKwadrat = new Kwadrat(6.0);
        
        System.out.println("Obwód kwadratu: " + przykladowyKwadrat.obliczObwod());
        System.out.println("Pole kwadratu: " + przykladowyKwadrat.obliczPole());
    }
}
