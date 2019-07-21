package task2.service;


import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static template.Patterns.*;

public class UniqueWordsCounter {
    public Set<String> countUniqueWords(String text) {
        return (StreamSupport.stream(new MatcherGroupIterator(Pattern.compile(ONLY_WORDS), text), false))
                .map(s -> s.toLowerCase()) //making case insensitive
                .collect(Collectors.toSet());
    }
}
