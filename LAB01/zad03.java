package LAB01;

public class zad03 {

    public static void main(String[] args) {
        System.out.println("Miles   Kilometers");
        for (int i=1; i<11; i++) {
            int miles = i;
            double km = 1.609 * i;
            System.out.printf("%-8d%.3f\n", miles, km);
        }
    }
}