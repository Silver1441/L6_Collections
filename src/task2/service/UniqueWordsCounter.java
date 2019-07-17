package task2.service;


import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static template.Patterns.*;

public class UniqueWordsCounter {
    public static Set<String> countUniqueWords(String text) {
        Set<String> words = new HashSet<>();

        Pattern pattern = Pattern.compile(ONLY_WORDS);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            words.add(text.substring(matcher.start(), matcher.end()));
        }

        return words;
    }
}
