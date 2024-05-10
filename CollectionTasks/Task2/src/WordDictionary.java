import java.util.*;

public class WordDictionary {
    private TreeMap<Character, TreeSet<String>> dic;

    public WordDictionary() {
        dic = new TreeMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            dic.put(c, new TreeSet<>());
        }
    }

    public void addWord(String word){
        if(word.length() > 0){
            char letter = word.toLowerCase().charAt(0);
            dic.get(letter).add(word);
        }
    }

    public void printWords(char c){
        System.out.println(c + ": ");
        Iterator<String> itr = dic.get(c).iterator();
        while (itr.hasNext()){
            System.out.println("   " + itr.next());
        }
    }
    public void printDictionary(){
        for (char c = 'a'; c <= 'z'; c++) {
            printWords(c);
        }
    }


}
