package LAB04.zad05;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Zawodnik {
    public String imie;
    public int minSpeed;
    public int maxSpeed;
    public int dystansTotal;

    public Zawodnik(String imie, int minSpeed, int maxSpeed) {
        this.imie = imie;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
        this.dystansTotal = 0;
        przedstawSie();
    }

    public void przedstawSie() {
        System.out.println("Jestem " + imie + " biegam z prędkością " + minSpeed + "-" + maxSpeed + " km/h.");
    }

    public void biegnij() {
        Random random = new Random();
        int randomSpeed = random.nextInt(maxSpeed - minSpeed + 1) + minSpeed;
        dystansTotal += randomSpeed; // Przyjąłem domyślnie że zawodnik biegnie przez godzinę

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(imie + " pokonał dystans " + randomSpeed + "km");
    }
}
