package group1.Chapter14.WilldcardDemo;

public class Stats<T extends Number> {
    T[] array;

    Stats(T[] o) {
        array = o;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].doubleValue();
        }
        return sum / array.length;
    }

    boolean sameAvg(Stats<?> ob) {
        if (average() == ob.average()) {
            return true;
        }
        return false;
    }
}
