package homework.homework8;

public class DynamicArray {
    private int array[] = new int[10];
    private int size;


    public void add(int item) {
        if (size == array.length) {
            extend();
        }
        array[size++] = item;
    }

    public int get(int index) {
        if (index >= array.length) {
            return -1;
        }
        return array[index];
    }

    public void print() {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public void extend() {
        int array2[] = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }
}
