package LAB02;

public class zad04 {
    public static void printMacierz(int[][] m) {
        for(int i=0; i<m.length;i++) {
            for(int j=0; j<m.length;j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] macierz = {{4,1,8},{7,2,0},{1,3,9}};
        printMacierz(macierz);
    }
}
