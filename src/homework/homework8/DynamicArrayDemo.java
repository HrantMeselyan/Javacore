package homework.homework8;


public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();

        for (int i = 0; i < 25; i++) {
            array.add(i);
        }
        System.out.print("Array : ");
        array.print();
        System.out.println();

        System.out.println("Get Element By Index : " + array.get(0));

        System.out.print("Delete Element By Index : ");
        array.delete(8);
        System.out.println();

        System.out.print("Set Element : ");
        array.set(1, 7);
        System.out.println();

        System.out.print("Add Element : ");
        array.add(2, 47);
        System.out.println();

        System.out.print("Exists : ");
        System.out.println(array.exists(7));

        System.out.println("Get Value Index : " + array.getIndexByValue(47));

    }
}
