package LAB03.zad03;

public class TV {
    public int channel;
    public int volume;
    public boolean on;

    public TV() {
        this.channel = 1;
        this.volume = 5;
        this.on = false;
    }

    public void tvOn() {
        on = true;
        System.out.println("Włączono telewizor.");
    }

    public void tvOff() {
        on = false;
        System.out.println("Wyłączono telewizor.");
    }

    public void channelUp() {
        if(this.channel < 20) {
            channel += 1;
            System.out.println("Zmieniono kanał na: " + channel);
        } else {
            System.out.println("Nie ma więcej kanałów!");
        }
    }

    public void channelDown() {
        if(this.channel > 1) {
            channel -= 1;
            System.out.println("Zmieniono kanał na: " + channel);
        } else {
            System.out.println("Znajdujesz się na 1 kanale!");
        }
    }

    public void volumeUp() {
        if(this.volume < 10) {
            volume += 1;
            System.out.println("Zwiększono głośność na: " + volume);
        } else {
            System.out.println("Osiągnięto maksymalną głośność!");
        }
    }

    public void volumeDown() {
        if(this.volume > 1) {
            volume -= 1;
            System.out.println("Zmniejszono głośność na: " + volume);
        } else {
            System.out.println("Osiągnięto minimalną głośność!");
        }
    }
}
