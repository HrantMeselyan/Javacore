package group1.Chapter9.fixedStack;

public class IFTest {
    public static void main(String[] args) {
        FixedStack myStack1 = new FixedStack(5);
        FixedStack myStack2 = new FixedStack(10);

        for (int i = 0; i < 5; i++) {
            myStack1.push(i);
        }
        for (int i = 0; i < 7; i++) {
            myStack2.push(i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(myStack1.pop() + " ");
        }
        System.out.println();
        for (int i = 0; i < 9; i++) {
            System.out.print(myStack2.pop() + " ");
        }
    }
}
