package task1;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Name> names = new LinkedList<>();
        names.add(new Name(1, "Petro"));
        names.add(new Name(2, "Dimon"));
        names.add(new Name(3, "Gennadiy"));
        names.add(new Name(4, "Sanchez"));
        names.add(new Name(5, "Onufrii"));
        names.add(new Name(6, "Arsen"));
        names.add(new Name(7, "Akakii"));
        System.out.print(ListService.getOddNames(names));
    }
}
