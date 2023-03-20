package group1.Chapter11.PC;

public class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 40) {
            q.get();
            i++;
        }
    }
}
