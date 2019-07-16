package task1.service;

import java.util.Map;

public class DemoOutput {
    public static void showOutput(Map<String, Long> words){
        for (Map.Entry<String, Long> entry : words.entrySet()) {
            System.out.println("\"" + entry.getKey() + "\"" + ", times in text: " + entry.getValue());
        }
    }
}
