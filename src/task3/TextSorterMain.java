package task3;

import task3.service.TextToWordsSeparator;

import static task3.service.DemoOutput.showOutput;
import static template.TextHolder.*;

//Отсортировать все слова из текста двумя способами: естественной сортировкой(по алфавиту)
//и по длине слов (Подсказка: лучше и проще использовать Comparator).

public class TextSorterMain {
    public static void main(String[] args) {
        TextToWordsSeparator wordsSeparator = new TextToWordsSeparator();
        showOutput(wordsSeparator.makeListOfWords(text));
    }
}
