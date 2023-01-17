package homework.homework8;

public class DynamicArray {
    int array[] = new int[10];
    int size = 0;

    DynamicArray() {
        size = 0;
    }

    void add(int item) {
        if (size == array.length) {
            dynamicArray();
        }
        array[size++] = item;
    }

    int get(int index) {

        return array[index];
    }

    void print() {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    void dynamicArray() {
        int array2[] = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }
}
