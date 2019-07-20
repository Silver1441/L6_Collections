package service;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherGroupIterator implements Spliterator<String> {
    private final Matcher matcher;

    public MatcherGroupIterator(Pattern pattern, String text) {
        matcher = pattern.matcher(text);
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
