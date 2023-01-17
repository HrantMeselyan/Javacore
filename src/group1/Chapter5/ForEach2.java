package group1.Chapter5;

public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : array) {
            System.out.println("count  = " + x);
            sum +=x;
            if (x == 5) {
                break;
            }
        }
        System.out.println("first 5 elements " + sum);
    }
}
