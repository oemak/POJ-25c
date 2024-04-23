package LAB05.zad01;

public class Cat extends Animal {
    
    public Cat(String name, String color) {
        super(name, color);
    }

    public String makeSound() {
        return super.makeSound() + "Meow!";
    }
}
