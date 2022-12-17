package group1.Chapter3;

public class Average {
    public static void main(String[] args) {
        double numbers[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;

        for (int i = 0; i < 5; i++) {
            result = result + numbers[i];

        }
        System.out.println("Numbers average = " + result / 5);

    }
}
