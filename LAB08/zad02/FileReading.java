package LAB08.zad02;

import java.io.*;

public class FileReading {
    public static void main(String[] args) {
        int sum = 0;

        try (FileReader fileReader = new FileReader("LAB08/zad02/input")) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String linia;
            int liniaNum = 1;

            while ((linia = bufferedReader.readLine()) != null) {
                if (liniaNum % 2 == 0) {
                    int n = Integer.parseInt(linia);
                    sum += n;
                }
                liniaNum++;
            }

            System.out.println("Suma: " + sum);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
