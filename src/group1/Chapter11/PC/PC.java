package group1.Chapter11.PC;

public class PC {
    public static void main(String[] args) {
        Q q  = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("For exit press Ctrl + C.");
    }
}
