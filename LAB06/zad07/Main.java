package LAB06.zad07;

public class Main {
    public static int sumaTablic(int[]... tablice) {
        int suma = 0;
        for (int[] tablica : tablice) {
            for (int liczba : tablica) {
                suma += liczba;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int[] t1 = {1,2,3};
        int[] t2 = {4,5,1};
        int[] t3 = {4};

        System.out.println(sumaTablic(t1,t2,t3));
    }
}
