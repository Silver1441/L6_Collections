package task1.service;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsCounter {
    public static Map<String, Long> countTheWords(String text) {
        Map<String, Long> words = new HashMap<>();
        Long counter;

        Pattern pattern = Pattern.compile("[\\wА-Яа-я]+(\\-[\\wА-Яа-я]+)?");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String tempString = text.substring(matcher.start(), matcher.end());
            counter = 1L;

            if (!words.containsKey(tempString)) {
                words.put(tempString, counter);
            } else {
                words.put(tempString, words.get(tempString) + 1L);
            }
        }

        return words;
    }
}
