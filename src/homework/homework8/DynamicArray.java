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
        if (index >= array.length || index < 0) {
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
        int array2[] = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }

    public void delete(int index) {
        if (index < size && index > 0) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
            print();
        } else {
            System.out.println("Index Not Found");
        }
    }
}
