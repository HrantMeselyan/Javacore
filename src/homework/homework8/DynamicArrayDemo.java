package homework.homework8;


public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();

        for (int i = 0; i < 20; i++) {
            array.add(i);
        }
        array.print();
        System.out.println();

        System.out.println(array.get(0));

        array.delete(8);
        System.out.println();

        array.set(1, 7);

        System.out.println();
        array.add(4, 47);

        System.out.println();
        System.out.println(array.exists(0));

        System.out.println(array.getIndexByValue(1));


    }
}
