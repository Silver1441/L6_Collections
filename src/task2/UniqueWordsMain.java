package task2;

import static template.TextHolder.*;
import static task2.service.UniqueWordsCounter.countUniqueWords;
import static task2.service.DemoOutput.showOutput;

//Вывести все уникальные слова из текста. Рекомендуется использовать Set<String>.

public class UniqueWordsMain {
    public static void main(String[] args) {
        showOutput(countUniqueWords(text));
    }
}
