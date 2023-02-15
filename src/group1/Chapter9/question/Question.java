package group1.Chapter9.question;

import java.util.Random;

public class Question implements SharedConstants {
    Random rand = new Random();

    int ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 30) {
            return no;
        } else if (prob < 60) {
            return yes;
        } else if (prob < 75) {
            return later;
        } else if (prob < 98) {
            return soon;
        } else return never;
    }
}
