package task1.service;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static template.Patterns.*;

public class WordsCounter {
    public static Map<String, Long> countTheWords(String text) {
        Map<String, Long> words = new HashMap<>();
        Long counter = 1L;

        Pattern pattern = Pattern.compile(ONLY_WORDS);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String word = text.substring(matcher.start(), matcher.end());

            if (!words.containsKey(word)) {
                words.put(word, counter);
            } else {
                words.put(word, words.get(word) + 1L);
            }
        }

        return words;
    }
}
