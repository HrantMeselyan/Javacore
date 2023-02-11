package group1.Chapter9.fixedStack;

public class FixedStack implements IntStack {
    private int stack[];
    private int tos;

    FixedStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stack.length - 1) {
            extend();
        }
        stack[++tos] = item;
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is not loaded");
            return 0;
        }
        return stack[tos--];
    }

    private void extend() {
        int[] array = new int[stack.length + 10];
        for (int i = 0; i < stack.length; i++) {
            array[i] = stack[i];
        }
        stack = array;
    }
}
