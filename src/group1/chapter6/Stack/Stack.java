package group1.chapter6.Stack;

public class Stack {
    int array[] = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("tos filled");
        }
        array[++tos] = item;
    }

    int pop() {
        if (tos == -1) {
            System.out.println("Stack not loaded");
        }
        return array[tos--];
    }
}
