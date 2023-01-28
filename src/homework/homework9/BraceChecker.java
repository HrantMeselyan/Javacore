package homework.homework9;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char first = text.charAt(i);
            if (first == '{' || first == '[' || first == '(') {
                stack.push(first);
            }
            if (first == ' ' && stack.tos != -1) {
                int last = stack.pop();
                stack.push(last);
                char firstSymbol = (char) last;
                if (first == ' ' && last == '{' || first == ' ' && last == '(' || first == ' ' && last == '[') {

                    System.out.println("Error: Opened by " + firstSymbol + " but not closed");
                    return;
                }
            }
            if (first == '}' || first == ']' || first == ')') {
                if (stack.tos == -1) {
                    System.out.println("Error : Closed by  " + first + " but not opened at " + i);
                    return;
                }
                int last = stack.pop();
                stack.push(last);
                char firstSymbol = (char) last;
                if (first == '}' && last == '{' || first == ')' && last == '(' || first == ']' && last == '[') {
                    stack.pop();
                } else {
                    System.out.println("Error: Opened by " + firstSymbol + " but closed " + first + " at  " + i);
                    return;
                }
            }
        }
        if (stack.tos == -1) {
            System.out.println("Text is a correct");
        }
    }
}