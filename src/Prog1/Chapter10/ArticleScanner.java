package Prog1.Chapter10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArticleScanner {

    private ArrayList<String> words;
    private Scanner scan;
    private boolean ignoreCase;

    // constructor
    public ArticleScanner(String filePath, boolean ignoreCase) {
        this.ignoreCase = ignoreCase;

        //  create input stream from file
        try {
            this.scan = new Scanner(new File(filePath));
        } catch (FileNotFoundException e) {
            System.out.println(String.format("The file: \"%s\" does not exist", filePath));
        }

        // fill set
        words = new ArrayList<>();
        String word;
        while (scan.hasNext()) {
            // free words from special characters
            word = scan.next().replaceAll("[^a-zA-ZäüößÄÜÖ]", "");
            if (!word.isEmpty()) {
                words.add(word);
            }
        }

    }

    public void printWords() {

        // sort 'words'
        if (ignoreCase) {
            words.sort(String::compareToIgnoreCase);
        } else {
            words.sort(String::compareTo);
        }

        // print each word with its amount
        String tmp = "";
        int counter = 1;
        for (String word : words) {
            if (word.equals(tmp)|| (ignoreCase && word.toLowerCase().equals(tmp.toLowerCase()))) {
                counter++;
            } else {
                if (!tmp.isEmpty()) {
                    System.out.println(String.format("%-20s (%d)", tmp, counter));
                    counter = 1;
                }
            }
            tmp = word;
        }
    }
}
