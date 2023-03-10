package homework.genericStorage;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Repository<Integer> integerRepository = new Repository<>(new ArrayList<>());
        integerRepository.add(400);
        integerRepository.add(490);
        List<Integer> elements = integerRepository.getElements();
        integerRepository.print();

        Repository<String> stringRepository = new Repository<>(new ArrayList<>());
        stringRepository.add("hello");
        stringRepository.add("hy");
        List<String> elements1 = stringRepository.getElements();
        stringRepository.print();
    }
}
