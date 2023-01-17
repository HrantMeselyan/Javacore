package group1.Chapter6.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack myStack = new Stack();

        for (int i = 0; i < 10; i++) {
            myStack.push(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(myStack.pop() + " ");
        }

    }
}
