package homework.homework6;


public class ArrayUntilDemo {
    public static void main(String[] args) {
        ArrayUntil array = new ArrayUntil();
        int[] arr = {2, 5, 8, 10, 32, 22, 66, 12, 30, 0, 44, -9, 3, 11, -2,109,108};

        array.even(arr);
        array.odd(arr);
        array.evenCount(arr);
        array.oddCount(arr);
        array.average(arr);
        array.numberSum(arr);
        array.middleNumber(arr);
        array.firstNumber(arr);
        array.lastNumber(arr);

    }
}
