package Prog1.Chapter10;

public class Launcher {
    public static void main(String[] args) {
        String filePath = "src/Prog1/Chapter10/Article.txt";
        ArticleScanner articleScanner = new ArticleScanner(filePath, false);
        ArticleScanner articleScannerIgnoreCase = new ArticleScanner(filePath, true);
        articleScanner.printWords();
        //articleScannerIgnoreCase.printWords();
    }
}
