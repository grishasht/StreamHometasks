package task3;

import java.util.ArrayList;
import java.util.List;

public class ListService {
    public static List<Integer> getNumbers(List<String> numbersList){
        List<Integer> numbers = new ArrayList<>();
        numbersList.stream()
                .map(string -> {
                    for(int i = 0; i < string.length(); i ++){
                        if (Character.isDigit(string.charAt(i)))
                            numbers.add(Integer.parseInt(string.charAt(i) + ""));
                    }
                    return numbers;
                }).count();
        return numbers;
    }
}
