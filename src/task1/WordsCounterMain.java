package task1;

import task1.service.WordsCounter;

import static task1.service.DemoOutput.showOutput;
import static template.TextHolder.*;

//Подсчитать количество повторений для каждого слова -
//(принять, что знаки пробела, знаки препинания являются разделителями слов).
//Рекомендуется использовать Map<String, Long>.

public class WordsCounterMain {
    public static void main(String[] args) {
        WordsCounter counter = new WordsCounter();
        showOutput(counter.countTheWords(text));
    }
}
