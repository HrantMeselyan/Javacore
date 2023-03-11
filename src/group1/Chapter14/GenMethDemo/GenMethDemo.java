package group1.Chapter14.GenMethDemo;

public class GenMethDemo {
    static <T extends Comparable<T>, V extends T>
    boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        if (isIn(2, numbers)) {
            System.out.println("Number 2 was in numbers array");
        }
        if (!isIn(7, numbers)) {
            System.out.println("Number 7 is not in numbers array");
        }
        String[] str = {"one", "two", "three", "four", "five"};
        if (isIn("one", str)) {
            System.out.println("one was in str array");
        }
        if (!isIn("seven",str)) {
            System.out.println("seven is not in str array");
        }
//        ERROR!
//        isIn(isIn("two",numbers)){
//            System.out.println("Two was in numbers array");
//        }
    }
}
