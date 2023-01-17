package group1.Chapter5;

public class ForEach3 {
    public static void main(String[] args) {

        int sum = 0;
        int array[][] = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
            for (int x[] : array) {
                for (int y : x) {
                    System.out.println("count  = : " + y);
                    sum = sum + y;
                }
            }
        }
        System.out.println("sum = " + sum);
    }
}
