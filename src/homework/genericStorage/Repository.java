package homework.genericStorage;

import java.util.ArrayList;
import java.util.List;

public class Repository<T> {
    private List<T> array;

    Repository(List<T> array) {
        this.array = array;
    }

    public void add(T t) {
        array.add(t);
    }

    public List<T> getElements() {
        List<T> list = new ArrayList<>(array);
        return list;
    }
    public void print(){
        for (T t : array) {
            System.out.println(t);
        }
    }
}
