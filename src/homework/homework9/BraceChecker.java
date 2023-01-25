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
            if (first == '}' || first == ']' || first == ')') {
                if (stack.tos == -1) {
                    System.out.println("Error: " + first + " at index " + i);
                    return;
                }
                int last = stack.pop();
                stack.push(last);

                if (first == '}' && last == '{' || first == ')' && last == '(' || first == ']' && last == '[') {
                    stack.pop();
                } else {
                    char firstSymbol = (char) last;
                    System.out.println("Error: Opened " + firstSymbol + " but closed " + first + " at index " + i);
                    return;
                }
            }
        }
        if (stack.tos == -1) {
            System.out.println("Text is a correct");
        }
    }
}
