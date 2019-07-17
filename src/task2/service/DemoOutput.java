package task2.service;

import java.util.Set;

public class DemoOutput {
    public static void showOutput(Set<String> words) {
        words.stream().forEach(word -> System.out.println("\"" + word + "\""));
        System.out.println("\nTotal:  " + words.size());
    }
}
