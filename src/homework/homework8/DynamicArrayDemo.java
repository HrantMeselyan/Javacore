package homework.homework8;


public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();

        for (int i = 0; i < 20; i++) {
            array.add(i);
        }
        array.print();
        System.out.println();
        System.out.println(array.get(4));
        array.delete(4);


    }
}
