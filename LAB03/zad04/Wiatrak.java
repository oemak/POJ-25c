package LAB03.zad04;

public class Wiatrak {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;
    public int speed;
    public boolean on;
    public double radius;
    public String color;

    public Wiatrak() {
        this.speed = MEDIUM;
        this.on = false;
        this.radius = 3.0;
        this.color = "Biały";
    }

    public Wiatrak(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on; 
        this.radius = radius;
        this.color = color;
    }

    public void informacje() {
        System.out.println("Informacje o wiatraku: \n");
        System.out.println("Czy wiatrak jest włączony?: " + (on ? "Tak" : "Nie"));
        System.out.println("Prędkość wiatraka (1-3): " + speed);
        System.out.println("Promień wiatraka: " + radius);
        System.out.println("Kolor wiatraka: " + color);
    }
}
