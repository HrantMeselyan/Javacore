package homework.homework8;

public class DynamicArray {
    private int[] array = new int[10];
    private int size;


    public void add(int item) {
        if (size == array.length) {
            extend();
        }
        array[size++] = item;
    }

    public int get(int index) {
        if (index > size || index < 0) {
            return -1;
        }
        return array[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void extend() {
        int[] array2 = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }

    public void delete(int index) {
        if (index >= size || index < 0) {
            System.out.println("Index Not Found");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }


    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Index Not Found");
            return;
        }
        array[index] = value;
    }

    public void add(int index, int value) {
        if (index >= size || index < 0) {
            System.out.println("Index Not Found");
            return;
        }
        if (size == array.length) {
            extend();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        size++;
        array[index] = value;
    }

    public boolean exists(int value) {
        boolean exist = false;
        for (int i : array) {
            if (value == i) {
                exist = true;
                break;
            }
        }
        return exist;
    }

    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
