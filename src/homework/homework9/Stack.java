package homework.homework9;
public class Stack {
    int array[] = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == array.length-1) {
            extend();
        }
        array[++tos] = item;
    }

    int pop() {
        if (tos == -1) {
            System.out.println("Stack not loaded");
        }
        return array[tos--];
    }
    public void extend() {
        int[] array2 = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }
}
