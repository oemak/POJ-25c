package LAB03.zad03;

public class Remote {
    public TV tv;

    public Remote(TV tv) {
        this.tv = tv;
    }

    public void tvOnOff() {
        if (tv.on == false) {
            tv.tvOn();
        } else {
            tv.tvOff();
        }
    }

    public void channelUp() {
        tv.channelUp();
    }

    public void channelDown() {
        tv.channelDown();
    }

    public void volumeUp() {
        tv.volumeUp();
    }

    public void volumeDown() {
        tv.volumeDown();
    }
}
