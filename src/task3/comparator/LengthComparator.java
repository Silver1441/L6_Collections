package task3.comparator;

import java.util.Comparator;

public class LengthComparator implements Comparator<String> {
    public int compare(String firstString, String secondString) {
        return Integer.compare(firstString.length(), secondString.length());
    }
}
