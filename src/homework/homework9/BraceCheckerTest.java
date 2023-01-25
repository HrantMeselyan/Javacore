package homework.homework9;

import java.sql.SQLOutput;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "{hello} java {}";
        BraceChecker bc = new BraceChecker(text);
        bc.check();

    }
}
