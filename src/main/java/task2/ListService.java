package task2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListService {
    public static List<String> sortStrings(List<String> strings){
        return strings.stream()
                .map(s -> s.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
