package group1.Chapter14.GenIFDemo;

public interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}
