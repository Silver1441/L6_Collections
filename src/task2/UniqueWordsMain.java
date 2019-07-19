package task2;

import task2.service.UniqueWordsCounter;

import static template.TextHolder.*;
import static task2.service.DemoOutput.showOutput;

//Вывести все уникальные слова из текста. Рекомендуется использовать Set<String>.

public class UniqueWordsMain {
    public static void main(String[] args) {
        UniqueWordsCounter counter = new UniqueWordsCounter();
        showOutput(counter.countUniqueWords(text));
    }
}
