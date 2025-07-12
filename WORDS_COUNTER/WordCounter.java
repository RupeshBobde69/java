package WORDS_COUNTER;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordCounter {
    public static Map<String, Integer> countWordsFromFile(String filePath){
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", ""); // Remove punctuation
                String[] words = line.split("\\s+"); // Split by whitespace       
                for (String word : words){
                    if (!word.isEmpty()){
                        wordCount.put(word, wordCount.getOrDefault(words, 0)+1);
                    }
                }  
            }
        }
        catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
        return wordCount;
    }

    public static List<Map.Entry<String, Integer>> getTopWords(Map<String, Integer> wordCount, int n){
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCount.entrySet());
        sortedWords.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue())); // Sort by count in descending order
        return sortedWords.subList(0, Math.min(n, sortedWords.size())); // Return top n words
    }

}
