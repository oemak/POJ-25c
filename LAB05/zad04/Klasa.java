package LAB05.zad04;

public class Klasa {
    public int arg1;
    public int arg2;
    public int arg3;
    public int arg4;
    public int arg5;

    public Klasa(int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
        this.arg4 = arg4;
        this.arg5 = arg5;
    }

    public String toString() {
        return arg1 + " " + arg2 + " " + arg3 + " " + arg4 + " " + arg5;
    }

    public static void main(String[] args) {
        Klasa klasa = new Klasa(1, 2 , 3, 4 , 5);
        System.out.println(klasa);
    }
}
