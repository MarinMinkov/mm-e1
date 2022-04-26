package Homework072;

import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class FixThisCode {
        public static FileWriter getFileWriter(String filePath) throws IOException {
            FileWriter fileWriter;
            try
            {
                fileWriter = new FileWriter(filePath, true);
            }
            catch (IOException e)
            {
                System.out.println("Error: " + e);
                fileWriter = new FileWriter(filePath + "(2)", true);
                System.out.println("Using a new file path:" + filePath + "(2)" );
            }
                return fileWriter;
        }
        public static void printToFile(FileWriter fileWriter, String text, int repeat) throws IOException {
            try {
                for (int i = 0; i < repeat; i++) {
                    fileWriter.write(text + "\n");
                }

            }
            catch (IOException e)
            {
                System.out.println("Error when writing to the file.");
            }
            fileWriter.flush();
            fileWriter.close();
        }

        public static void main(String[] args) throws IOException
        {
            Scanner scanner = new Scanner(System.in);
            String filePath = scanner.nextLine();
            int howManyTimesToPrintTheTextToFile;
            try
            {
                howManyTimesToPrintTheTextToFile = scanner.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Error: NaN");
                howManyTimesToPrintTheTextToFile = 1;
                System.out.println("Set a default value 1.");
            }
            String textToAdd = scanner.next();
            printToFile(getFileWriter(filePath), textToAdd, howManyTimesToPrintTheTextToFile);
        }
    }

