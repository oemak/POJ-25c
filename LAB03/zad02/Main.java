package LAB03.zad02;

public class Main {
    public static void main(String[] args) {
        Punkt punktX = new Punkt(1,2);
        Punkt punktY = new Punkt(3,4);

        System.out.println("Odległość między przykładowymi punktami X i Y to: " + punktX.obliczOdleglosc(punktY));
    }
}
