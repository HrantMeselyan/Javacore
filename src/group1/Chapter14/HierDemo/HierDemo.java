package group1.Chapter14.HierDemo;

public class HierDemo {
    public static void main(String[] args) {
        Gen2<String,Integer> x = new Gen2<>("Value = ", 99);
        System.out.print(x.getOb());
        System.out.println(x.getOb2());
    }
}
