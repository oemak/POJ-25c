package LAB02;

public class zad05 {
    public static int[][] SumaMacierzy(int[][] m1, int[][] m2) {
        int[][] suma = new int[m1.length][m1[0].length];
        if(m1.length == m2.length && m1[0].length == m2[0].length) {
            for(int i=0; i<m1.length;i++) {
                for(int j=0; j<m1[0].length;j++) {
                    suma[i][j] = m1[i][j] + m2[i][j];
                }
            }
        } else return new int[0][0];
        return suma;
    }

    public static void printMacierz(int[][] m) {
        for(int i=0; i<m.length;i++) {
            for(int j=0; j<m.length;j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] macierz1 = {{4,1,8},{7,2,0},{1,3,9}};
        int[][] macierz2 = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Suma macierzy to: ");
        printMacierz(SumaMacierzy(macierz1, macierz2));
    }
}
