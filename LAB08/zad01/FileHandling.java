package LAB08.zad01;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        File exerciseFolder = new File("LAB08/zad01/exercise");
        exerciseFolder.mkdir();

        File file1 = new File(exerciseFolder, "file1.txt");
        File file2 = new File(exerciseFolder, "file2.txt");
        File file3 = new File(exerciseFolder, "file3.txt");
        try {
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        } catch (IOException e) {
            System.err.println(e);
        }

        File folder1 = new File(exerciseFolder, "folder1");
        File folder2 = new File(exerciseFolder, "folder2");
        folder1.mkdir();
        folder2.mkdir();

        InformationProvider informationProvider = new InformationProvider();

        informationProvider.displayInformation(file1);
        informationProvider.displayInformation(folder1);
    }
}
