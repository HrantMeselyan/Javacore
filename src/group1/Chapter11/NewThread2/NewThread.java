package group1.Chapter11.NewThread2;

public class NewThread extends Thread {

    NewThread() {
        super("Test Thread");
        System.out.println("Daughter thread: " + this);
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Daughter thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Daughter thread is ended.");
    }
}
