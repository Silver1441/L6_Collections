package task3.service;

import task3.comparator.LengthComparator;

import java.util.List;
import java.util.stream.Collectors;

public class ListWordsLengthOrder implements ListSorter {
    public List<String> sortList(List<String> list) {
        return list.stream().sorted().sorted(new LengthComparator()).collect(Collectors.toList());
    }
}
