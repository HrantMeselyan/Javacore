package group1.Chapter5;

public class BreakLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 11) {
                break;
            }
            System.out.println(" i: " + i);
        }
        System.out.println("for was break.");
    }
}
