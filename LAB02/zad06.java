package LAB02;

public class zad06 {
    public static int NWD(int a, int b) {
        while (a % b != 0) {
            int bb = b;
            b = a % b;
            a = bb;
        }
        return b;
    }

    public static void main(String[] args) {
        int x = 282;
        int y = 78;

        System.out.println("NWD podanych liczb to: " + NWD(x,y));
    }
}
