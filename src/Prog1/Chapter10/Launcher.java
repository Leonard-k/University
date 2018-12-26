package Prog1.Chapter10;

public class Launcher {
    public static void main(String[] args) {
        String filePath = "/root/IdeaProjects/University/UNI/src/Prog1/Chapter10/Article.txt";
        ArticleScanner articleScanner = new ArticleScanner(filePath, false);
        articleScanner.printWords();
    }
}
