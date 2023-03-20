package group1.Chapter11.CallMe;

public class Caller implements Runnable {
    String msg;
    CallMe target;
    Thread t;

    public Caller(CallMe target, String s) {
        this.target = target;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        target.call(msg);
    }
}
