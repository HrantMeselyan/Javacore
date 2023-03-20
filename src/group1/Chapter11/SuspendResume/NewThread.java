package group1.Chapter11.SuspendResume;

public class NewThread implements Runnable {
    String name;
    Thread t;
    boolean suspendFlag;

    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread " + t);
        suspendFlag = false;
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 15; i++) {
                System.out.println(name + ": " + i);
                Thread.sleep(300);
                synchronized (this){
                    while (suspendFlag){
                        wait();
                    }
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread was ended.");
    }

    synchronized void mySuspend(){
        suspendFlag = true;
    }
    synchronized void myResume(){
        suspendFlag = false;
        notify();
    }
}
