package task3.service;

import java.util.List;

public class DemoOutput {
    public static void showOutput(List<String> list) {
        System.out.println("List in natural order:");
        new ListNaturalSortOrder().sortList(list).stream().forEach(word -> System.out.print("\"" + word + "\"" + "  "));
        System.out.println("\n\nList in length order:");
        new ListWordsLengthOrder().sortList(list).stream().forEach(word -> System.out.print("\"" + word + "\"" + "  "));
    }
}
