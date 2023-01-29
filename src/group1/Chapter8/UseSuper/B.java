package group1.Chapter8.UseSuper;

public class B extends A {
    int i;

    B(int a, int b) {
        super.i = a;
        i = b;
    }
    void show(){
        System.out.println("Member i in super class: " + super.i);
        System.out.println("Member i in subclass: " + i);
    }
}
