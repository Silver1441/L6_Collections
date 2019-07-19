package task2.service;


import java.util.*;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static java.util.stream.Collectors.toSet;
import static template.Patterns.*;

public class UniqueWordsCounter {
    public static Set<String> countUniqueWords(String text) {
        Pattern pattern = Pattern.compile(ONLY_WORDS);

        Set<String> result = (StreamSupport.stream(new MatcherGroupIterator(pattern,text),false))
                //.map( s -> s.toLowerCase() )
                .collect(Collectors.toSet());
        return result;

    }

    private static class MatcherGroupIterator implements Spliterator<String> {
        private final Matcher matcher;

        public MatcherGroupIterator(Pattern p, String s) {
            matcher = p.matcher(s);
        }

        @Override
        public boolean tryAdvance(Consumer<? super String> action) {
            if (!matcher.find()) {
                return false;
            }
            action.accept(matcher.group());
            return true;
        }

        @Override
        public Spliterator<String> trySplit() {
            return null;
        }

        @Override
        public long estimateSize() {
            return Long.MAX_VALUE;
        }

        @Override
        public int characteristics() {
            return Spliterator.NONNULL;
        }
    }
}
