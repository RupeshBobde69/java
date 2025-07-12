package WORDS_COUNTER;

import java.util.Map;
import java.util.List;

public class MAIN {
        public static void main(String[] args) {
        String filePath = "C:\\Users\\rupes\\OneDrive\\Documents\\java\\WORDS_COUNTER\\input.txt";  // Make sure this file exists in your project directory

        Map<String, Integer> wordCount = WordCounter.countWordsFromFile(filePath);
        List<Map.Entry<String, Integer>> topWords = WordCounter.getTopWords(wordCount, 10);

        System.out.println("Top 10 most frequent words:");
        for (Map.Entry<String, Integer> entry : topWords) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}

