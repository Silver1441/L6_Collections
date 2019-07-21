package task3.service;

import task2.service.MatcherGroupIterator;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static template.Patterns.ONLY_WORDS;

public class TextToWordsSeparator {
    public List<String> makeListOfWords(String text) {
        return (StreamSupport.stream(new MatcherGroupIterator(Pattern.compile(ONLY_WORDS), text), false))
                .collect(Collectors.toList());
    }
}
