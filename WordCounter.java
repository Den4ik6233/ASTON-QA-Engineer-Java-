import java.util.*;

public class WordCounter {
    public void run() {
        List<String> wordsList = Arrays.asList("apple", "banana", "orange", "apple", "grape", "banana", "kiwi", "apple", "orange", "banana", "grape", "strawberry", "kiwi");

        System.out.println("Исходный набор слов:");
        for (String word : wordsList) {
            System.out.println(word);
        }

        Map<String, Integer> wordCounts = countWords(wordsList);
        printWordCounts(wordCounts);

        Set<String> uniqueWords = findUniqueWords(wordsList);
        printUniqueWords(uniqueWords);
    }

    private Map<String, Integer> countWords(List<String> wordsList) {
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : wordsList) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        return wordCounts;
    }

    private void printWordCounts(Map<String, Integer> wordCounts) {
        System.out.println("\nКоличество встреч каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private Set<String> findUniqueWords(List<String> wordsList) {
        return new HashSet<>(wordsList);
    }

    private void printUniqueWords(Set<String> uniqueWords) {
        System.out.println("\nУникальные слова:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
