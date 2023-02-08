package homework.homework9;

public class BraceChecker {
    private final String text;
    private final Stack stack = new Stack();

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                if (stack.tos == -1) {
                    System.out.println("Error : Closed By " + c + " but not opened at index " + i);
                    return;
                }
                int top = stack.pop();
                char first = (char) top;
                if ((c == '}' && first != '{') || (c == ']' && first != '[') || (c == ')' && first != '(')) {
                    System.out.println("Error : Opened By " + first + " but closed by " + c + " at index " + i);
                    return;
                }
            }
        }
        if (stack.tos != -1) {
            int c = stack.pop();
            char symbol = (char) c;
            System.out.println("Error: Opened By " + symbol + " but not closed");
            return;
        }
        System.out.println("Text is a correct ");
    }
}