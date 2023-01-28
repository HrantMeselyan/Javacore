package group1.Chapter8.SimpleInheritance;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Content of object superOb : ");
        superOb.showij();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Content of object subOb : ");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("Sum i, j, and k in object subOb:");
        subOb.sum();
    }
}
