package task1.service;

import java.util.Map;

public class DemoOutput {
    public static void showOutput(Map<String, Long> words){
        words.entrySet().stream()
                .forEach(word -> System.out.println("\"" + word.getKey() + "\"" +
                        "  - times in text: " + word.getValue()));
        System.out.println("\nTotal unique words count:  " + words.size());
    }
}
