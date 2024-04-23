package LAB05.zad01;

public class Main {
    public static void main(String[] args) {
        Dog pies = new Dog("Pies", "Czarny");
        Cat kot = new Cat("Kot", "Czarno-biały");

        System.out.println(pies.makeSound());
        System.out.println(kot.makeSound());
    }
}
