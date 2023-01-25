package homework.homework9;

public class BraceChecker {
    private String text;

    BraceChecker(String text) {
        this.text = text;
    }

    void check() {

        Stack stack1 = new Stack();
        for (int i = 0; i < text.length(); i++) {
            stack1.push(i);
            if (text.charAt(i) == '{') {
                char b  = text.charAt(i);
                System.out.print(b);
                for (int j = i + 1; j < text.length(); j++) {
                    if (text.charAt(j) == '}'){
                        char a = text.charAt(j);
                        System.out.print(a);
                        break;
                    }
                }
            }
        }
    }

    private void findIndex() {
        Stack stack = new Stack();
        int b = stack.pop();
        char a = text.charAt(b);
        char c = text.charAt(0);
        System.out.println(c + " " + a);

        if (c == '{') {
            if (a == '}') {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
