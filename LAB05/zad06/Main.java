package LAB05.zad06;

public class Main {
    public static void main(String[] args) {
        Calculator kalkulator = new Calculator();

        System.out.println("Kwadrat jednej liczby: " + kalkulator.calculate(2));
        System.out.println("Iloczyn dwóch liczb: " + kalkulator.calculate(2, 3));
        System.out.println("Suma trzech liczb: " + kalkulator.calculate(1, 2, 3));
    }
}
