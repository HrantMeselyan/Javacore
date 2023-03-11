package group1.Chapter14.HierDemo3;

public class HierDemo3 {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        Gen2<Integer> iOb2 = new Gen2<>(99);
        Gen2<String> str = new Gen2<>("Test");

        if (iOb2 instanceof Gen2<?>) {
            System.out.println("True");
        }
        if (iOb2 instanceof Gen<?>) {
            System.out.println("True");
        }
        if (str instanceof Gen2<?>) {
            System.out.println("True");
        }
        if (str instanceof Gen<?>) {
            System.out.println("True");
        }
        if (iOb instanceof Gen<?>) {
            System.out.println("True");
        }
        if (iOb instanceof Gen2<?>) {
            System.out.println("True");
        }
        //ERROR!
//        if (iOb2 instanceof Gen2<Integer>) {
//            System.out.println("hello");
//        }
    }
}
