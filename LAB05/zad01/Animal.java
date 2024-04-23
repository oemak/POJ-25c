package LAB05.zad01;

public class Animal {
    public String name;
    public String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String makeSound() {
        return color + " " + name + ": ";
    }
}
