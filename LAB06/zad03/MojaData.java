package LAB06.zad03;

public class MojaData {
    public int dzien;
    public int miesiac;
    public int rok;

    public MojaData(int dzien, int miesiac, int rok) {
        this.dzien = dzien;
        this.miesiac = miesiac;
        this.rok = rok;
    }

    private String convertMiesiac(int miesiac) {
        switch (miesiac) {
            case 1:
                return "sty";
            case 2:
                return "lut";
            case 3:
                return "mar";
            case 4:
                return "kwi";
            case 5:
                return "maj";
            case 6:
                return "cze";
            case 7:
                return "lip";
            case 8:
                return "sie";
            case 9:
                return "wrz";
            case 10:
                return "paź";
            case 11:
                return "lis";
            case 12:
                return "gru";
            default:
                return "INVALID";
        }
    }

    @Override
    public String toString() {
        // Wersja A
        // return String.format("%d.%d.%d", dzien, miesiac, rok);

        // Wersja B
        // return String.format("%02d.%02d.%d", dzien, miesiac, rok);

        // Wersja C
        return String.format("%d %s %d", dzien, convertMiesiac(miesiac), rok);
    }

    public static void main(String[] args) {
        MojaData data = new MojaData(1, 11, 2011);

        System.out.println(data);
    }
}


