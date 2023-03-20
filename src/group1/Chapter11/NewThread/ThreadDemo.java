package group1.Chapter11.NewThread;

public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Main thread : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread is ended.");
    }
}
