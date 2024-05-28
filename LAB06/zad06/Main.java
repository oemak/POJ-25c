package LAB06.zad06;

public class Main {

    public static String usunArg(int n, String... args) {
        String[] stringarr = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            stringarr[i] = args[i];
        }

        String output = "";
        for (int i = 0; i < args.length; i++) {
            if ((i + 1) % n != 0) {
                output += stringarr[i] + " ";
            }
        }

        return output;
    }

    public static void main(String[] args) {
        String test = usunArg(2, "Ala", "nie", "ma", "test", "kota i", "psa", "papugę");
        System.out.println(test);
    }
}
