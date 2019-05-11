package task4;

import java.util.stream.Stream;

public class UserRandom {
    private Long a = 25214903917L;
    private Integer c = 11;
    private Double m = Math.pow(2, 48);

    private Double x;

    public UserRandom(Double x) {
        this.x = x;
    }

    public void getRandom(){
        Stream.iterate(x, x -> x = (a * x + c) % m)
                .forEach(System.out::println);
    }
}
