package homework.homework2;

public class ArrayUntil {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30, 1};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int a = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > a) {
                a = array[i];

            }
        }
        System.out.println("max =  " + a);




        for (int i = 0; i < array.length; i++) {
            if (a > array[i]) {
               a = array[i];

            }
        }
        System.out.println("min =  " + a);
    }
}
