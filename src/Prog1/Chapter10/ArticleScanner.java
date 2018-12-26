package Prog1.Chapter10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class ArticleScanner {

    private TreeSet<String> words;
    private Scanner scan;
    private boolean ignoreCase = true;

    // constructor
    public ArticleScanner(String filePath, boolean ignoreCase) {
        this.ignoreCase = ignoreCase;

        try {
            this.scan = new Scanner(new File(filePath));
        } catch (FileNotFoundException e) {
            System.out.println(String.format("The file: \"%s\" does not exist", filePath));
        }
        // fill set
        if (ignoreCase) {
            words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        } else {
            words = new TreeSet<String>();
        }

        String word;
        while (scan.hasNext()) {
            word = scan.next().replaceAll("[^a-zA-ZäüößÄÜÖ]", "");
            if (!word.isEmpty()) {
                words.add(word);
            }
        }

    }

    public void printWords () {
        String tmp = "";
        int counter = 1;
        for (String word : words) {
            if (word.equals(tmp)) {
                counter++;
            } else {
                System.out.println(String.format("%s (%d)",word, counter));
                counter = 1;
            }
        }
    }
}
