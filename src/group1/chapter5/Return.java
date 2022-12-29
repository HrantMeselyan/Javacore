package group1.chapter5;

public class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("return period.");

        if (t) {
            return;
        }
        System.out.println("this operator will not be executed");
    }
}
