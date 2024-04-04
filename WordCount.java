import java.util.HashMap;

public class WordCount {

    public static HashMap<String, Integer> countWords(String str) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        String[] words = str.split("\\s+");

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }

    public static void main(String[] args) {
        String str = "Hello My name is Jamir Bagwan, Again Hello And Welcome";

        HashMap<String, Integer> wordCounts = countWords(str);

        System.out.println(wordCounts);
    }
}
