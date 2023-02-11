package group1.Chapter9.nestedIFDemo;

public class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();

        if(nif.isNotNegative(10)){
            System.out.println("Number is non-negative");
        }
        if(nif.isNotNegative(-12)){
            System.out.println("this code don`t worked");
        }

    }
}
