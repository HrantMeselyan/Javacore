package group1.Chapter8.Access;

public class Access {
    public static void main(String[] args) {
        B subOb = new B();

        subOb.setij(10,20);

        subOb.sum();
        System.out.println("Sum  = " + subOb.total);
    }
}
