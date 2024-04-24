package LAB05.zad03;

public class Electric extends Car{
    public boolean naladowany;

    public Electric(String kolor, String marka, boolean naladowany) {
        super(kolor, marka);
        this.naladowany = naladowany;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Naładowany?: " + (naladowany ? "tak" : "nie");
    }
}
