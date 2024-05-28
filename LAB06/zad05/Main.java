package LAB06.zad05;

public class Main {
    public static void main(String[] args) {
        Samochod s1 = new Samochod("BMW", "Czerwone", 2000);
        Samochod s2 = new Samochod("BMW", "Czerwone", 2000);

        System.out.println(s1);
        System.out.println(s1.equals(s2)); // Zwróci true

        Samochod s3 = new Samochod("BMW", "Czarne", 2000);
        System.out.println(s1.equals(s3)); // Zwróci false, ponieważ kolor jest inny

        SzybkiSamochod ss1 = new SzybkiSamochod("BMW", "Czerwone", 2000);
        System.out.println(ss1);
        System.out.println(s1.equals(ss1)); // Zwróci false (warunek getClass() != o.getClass()), dlatego nie ma potrzeby nadpisywania equals()

    }
}
