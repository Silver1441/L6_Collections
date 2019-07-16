package task1;

import static task1.service.WordsCounter.countTheWords;
import static task1.service.DemoOutput.showOutput;
import static task1.template.TextHolder.*;

public class WordsCounterMain {
    public static void main(String[] args) {
        showOutput(countTheWords(text));
    }
}
