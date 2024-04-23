package LAB05.zad01;

public class Dog extends Animal {

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public String makeSound() {
        return super.makeSound() + "Woof!";
    }
}
