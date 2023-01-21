package homework.homework8;


public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();

        for (int i = 0; i < 25; i++) {
            array.add(i);
        }
        array.print();
        System.out.println();
        System.out.println(array.get(0));
        array.delete(8);

    }
}
