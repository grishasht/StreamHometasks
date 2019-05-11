package task5;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("a", "b", "c");
        Stream<String> stream2 = Stream.generate(() -> "X");
        Zip.zip(stream1, stream2).forEach(System.out::println);
    }
}
