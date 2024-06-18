package LAB08.zad01;

import java.io.*;

public class InformationProvider {
    public void displayInformation(File file) {
        //System.out.println();
        System.out.println("Nazwa: " + file.getName());
        System.out.println("Ścieżka: " + file.getPath());
        System.out.println("Czy jest plikiem: " + file.isFile());
        System.out.println("Czy jest katalogiem: " + file.isDirectory());
        System.out.println("Czy plik istnieje: " + file.exists());
        System.out.println();
    }
}
