package LAB01;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class zad08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer[] liczby = new Integer[3];
        System.out.println("Podaj trzy liczby: ");
        for(int i=0; i<3; i++){
            liczby[i] = scan.nextInt();
        }
        
        Arrays.sort(liczby, Collections.reverseOrder());
        System.out.println("Podane liczby w kolejnos6ci malejacej to: " + Arrays.toString(liczby));
    }
}