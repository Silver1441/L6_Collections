package task3.service;

import java.util.List;
import java.util.stream.Collectors;

public class ListNaturalSortOrder implements ListSorter {
    public List<String> sortList(List<String> list) {
        return list.stream().sorted().collect(Collectors.toList());
    }
}
