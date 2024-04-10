package LAB03.zad06;

import java.util.Random;

public class Przeciwnik {
    public int HP;
    public String weapon;
    public String armor;

    public Przeciwnik(int HP, String weapon, String armor) {
        this.HP = HP;
        this.weapon = weapon;
        this.armor = armor;
    }

    public void attack(Gracz gracz) {
        Random random = new Random();
        int damage = 0;

        switch(weapon) {
            case "Kamienny miecz":
                damage = random.nextInt(5) + 10;
                break;
            case "Żelazny miecz":
                damage = random.nextInt(5) + 15;
                break;
            case "Diamentowy miecz":
                damage = random.nextInt(5) + 25;
                break;
        }
        gracz.takeDamage(damage);
    }

    public void takeDamage(int damage) {
        int trueDamage = damage;

        switch(armor) {
            case "Kolczasta zbroja":
                trueDamage -= 3;
                break;
            case "Żelazna zbroja":
                trueDamage -= 6;
                break;
            case "Diamentowa zbroja":
                trueDamage -= 9;
                break;
        }

        HP -= trueDamage;
        if (HP < 0) {
            HP = 0;
        }
    }
}
