package group1.Chapter12.Question;

public class AskMe {
    static void answer(Answers result) {
        switch (result){
            case NO :
                System.out.println("No");
                break;
            case YES:
                System.out.println("Yes");
                break;
            case MAYBE:
                System.out.println("Maybe");
                break;
            case LATER:
                System.out.println("Later");
                break;
            case SOON:
                System.out.println("Soon");
                break;
            case NEVER:
                System.out.println("Never");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        for (int i = 0; i < 4; i++) {
            answer(q.ask());
        }
    }
}
