package homework.homework6;


public class ArrayUntil {

    void even(int[] array) {

        System.out.print("Զույգ թվերն են ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");

            }
        }
    }

    void odd(int[] array) {


        System.out.println();
        System.out.print("Կենտ թվերն են  ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1 || array[i] % 2 == -1) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    void evenCount(int[] array) {


        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                a++;
            }

        }
        System.out.println("Զույգ թվերի քանակը  " + a);
    }

    void oddCount(int[] array) {

        int b = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                b++;
            }
        }
        System.out.println("կենտ թվերի քանկը  " + b);
    }

    void average(int[] array) {

        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num = array[i] + num;
        }
        System.out.println("Միջին թվաբանականը " + num / array.length);
    }

    void numberSum(int[] array) {

        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num = array[i] + num;
        }
        System.out.println("Միջին թվաբանականը " + num);
    }

    void middleNumber(int[] array) {

        System.out.println("Մջտեղի անդամը " + array[array.length / 2]);
    }

    void firstNumber(int[] array) {

        System.out.println("Առաջին անդամը " + array[0]);
    }

    void lastNumber(int[] array) {

        System.out.println("Վերջին անդամը " + array[array.length - 1]);
    }


}


