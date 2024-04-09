package LAB03.zad03;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Remote remote = new Remote(tv);

        remote.tvOnOff();

        remote.volumeUp();
        remote.volumeUp();
        remote.volumeDown();

        remote.channelUp();
        remote.channelDown();
        remote.channelDown();

        remote.tvOnOff();
    }
}
