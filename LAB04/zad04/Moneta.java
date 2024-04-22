package LAB04.zad04;

import java.util.Random;

public class Moneta {
    public Random random;
    
    public Moneta() {
        this.random = new Random();
    }

    public int rzut() {
        return random.nextInt(2);
    }
}
