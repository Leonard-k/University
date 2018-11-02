package Prog1.Chapter3;

import Prog1.UniUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Schrek {
    public static void main(String[] args) {


        File inFile = new File("C:\\Users\\leona\\IdeaProjects\\UNI\\src\\Prog1\\Chapter3\\InputData.txt");
        Scanner scanner;

        try {
            scanner = new Scanner(inFile);

            while (scanner.hasNextInt()) {
                int intValue = scanner.nextInt();

                ACSIIConverter.printIntAsASCII(intValue);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();
        UniUtils.printAuthor();
    }
}
