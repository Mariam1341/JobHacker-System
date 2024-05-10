import java.util.*;

public class Main {
    public static void main(String[] args) {
        WordDictionary dic = new WordDictionary();
        dic.addWord("Ahmed");
        dic.addWord("Mariam");
        dic.addWord("cook");
        dic.addWord("book");
        dic.addWord("look");
        dic.addWord("shoot");
        dic.addWord("mohammed");
        dic.addWord("Mariam");

        dic.printWords('m');

        System.out.println("*********************");

        dic.printDictionary();


//
    }
}