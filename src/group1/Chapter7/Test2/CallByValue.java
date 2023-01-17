package group1.Chapter7.Test2;

public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15;
        int b = 20;

        System.out.println("a and b before: " + a + " " + b);

        ob.meth(a, b);
        System.out.println("a and b after: " + a + " " + b);
    }
}
