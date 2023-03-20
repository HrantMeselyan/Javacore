package group1.Chapter11.PC;

public class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Received").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 40) {
            q.put(i++);
        }
    }
}
