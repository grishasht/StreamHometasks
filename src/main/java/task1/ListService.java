package task1;

import java.util.List;
import java.util.stream.Collectors;

public class ListService {

    public static String getOddNames(List<Name> names){
        return names.stream()
                .filter(name -> name.getCountName() % 2 != 0)
                .map(Name::toString)
                .collect(Collectors.joining());
    }
}
