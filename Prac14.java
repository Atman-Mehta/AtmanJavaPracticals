// Write a Java program to perform file handling.

package JavaPracticals;

import java.io.*;

public class Prac14 {
    public static void main(String[] args) {
        // File name
        String fileName = "example.txt";

        // Writing to a file
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, World!\n");
            writer.write("This is a file handling example.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Reading from a file
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            System.out.println("Contents of the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File '" + fileName + "' not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
