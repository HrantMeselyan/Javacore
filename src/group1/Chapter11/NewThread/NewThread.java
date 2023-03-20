package group1.Chapter11.NewThread;

public class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this,"test");
        System.out.println("Daughter thread is created " + t);
        t.start();
    }

    @Override
    public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Daughter thread : " + i);
                    Thread.sleep(500);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        System.out.println("Daughter thread is ended.");
    }
}
