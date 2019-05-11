package task2;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();

        strings.add("this");
        strings.add("is");
        strings.add("some");
        strings.add("strings");
        strings.add("you");
        strings.add("need");
        strings.add("to");
        strings.add("sort");

        ListService.sortStrings(strings).forEach(System.out::println);
    }
}
