package homework.homework9;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "{hello {java ano}  (hot)";
        BraceChecker bc = new BraceChecker(text);
        bc.check();
    }
}
