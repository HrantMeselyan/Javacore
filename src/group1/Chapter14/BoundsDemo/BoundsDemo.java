package group1.Chapter14.BoundsDemo;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<>(array);
        double v = iOb.average();
        System.out.println("Average of iOb = " + v);

        Double[] array2 = {1.1, 1.2, 1.3, 1.4, 1.5};
        Stats<Double> dOb = new Stats<>(array2);
        double w = dOb.average();
        System.out.println("Average of dOb = " + w);

         //ERROR!
//        String[] array3 = {"1","2","3","4","5"};
//        Stats<String> strOb = new Stats<>(array3);
//        double x = strOb.average();
//        System.out.println("Average of strOb = " + x);
    }
}
