package group1.Chapter5;

public class ForEach {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int x : array) {
            System.out.println("count : = " + x);
            sum += x;
        }
        System.out.println("count : " + sum);

    }
}
