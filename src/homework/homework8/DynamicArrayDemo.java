package homework.homework8;


public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();

        for (int i = 0; i < 30; i++) {
             array.add(i);
        }
        array.print();
    }
}
