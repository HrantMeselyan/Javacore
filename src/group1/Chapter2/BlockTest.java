package group1.Chapter2;
import java.util.Stack;


public class BlockTest {
    public static void main(String[] args) {
        int x;
        int y;

        y = 20;

        for (x = 0; x < 10; x++) {
            System.out.println(" x = " + x);
            System.out.println(" y = " + y);
            y = y - 2;
        }
        Stack<Integer> stack = new Stack<>();
    }
}