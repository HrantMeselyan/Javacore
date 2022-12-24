package homework.homework2;

public class ArrayUntil {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22,  66, 12, 30, 0, 44,-9};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int a = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > a) {
                a = array[i];

            }
        }
        System.out.println("max =  " + a);

        int u  = 18;
        for (int i = 0; i < array.length; i++) {
            if (u > array[i]) {
                u = array[i];

            }
        }
        System.out.println("min = " + u);
    }
}
