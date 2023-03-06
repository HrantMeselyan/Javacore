package group1.Chapter14.WilldcardDemo;

public class WildcardDemo {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<>(intArray);
        double v = iOb.average();
        System.out.println("Average of iOb = " + v);

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dOb = new Stats<>(doubleArray);
        v = dOb.average();
        System.out.println("Average of dOb = " + v);

        Float[] floatArray = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fOb = new Stats<>(floatArray);
        v = fOb.average();
        System.out.println("Average of fOb = " + v);

        System.out.println("Average of iOb and dOb ");
        if (iOb.sameAvg(dOb)) {
            System.out.println("equals!");
        } else {
            System.out.println(("false!"));
        }

        System.out.println("Average of iOb and fOb ");
        if (iOb.sameAvg(fOb)) {
            System.out.println("equals!");
        } else {
            System.out.println(("false!"));
        }
    }
}
