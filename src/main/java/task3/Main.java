package task3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arrays = Arrays.asList("1, 2, 0", "4, 5", "7, 9, 8");
        arrays.forEach(System.out::println);
        ListService.getNumbers(arrays).forEach(System.out::println);
    }
}
