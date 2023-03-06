package group1.Chapter14.BoundsDemo;

public class Stats<T extends Number> {
    T[] numbers;

    Stats(T[] object) {
        numbers = object;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i].doubleValue();
        }
        return sum / numbers.length;
    }
}
