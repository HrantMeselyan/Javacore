package group1.Chapter9.question;

public class AskMe implements  SharedConstants{
    static void answer(int result){
        switch (result){
            case no:
                System.out.println("no");
                break;
            case yes:
                System.out.println("yes");
                break;
            case maybe:
                System.out.println("maybe");
                break;
            case later:
                System.out.println("later");
                break;
            case soon:
                System.out.println("soon");
                break;
            case never:
                System.out.println("never");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();

        for (int i = 0; i < 10; i++) {
            answer(q.ask());
        }
    }
}