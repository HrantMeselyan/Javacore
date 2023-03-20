package group1.Chapter11.SuspendResume;

public class SuspendResume {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");

        try {
            Thread.sleep(1000);
            ob1.mySuspend();
            System.out.println("Stop thread One");
            Thread.sleep(1000);
            ob1.myResume();
            System.out.println("Restart thread One");
            ob2.mySuspend();
            System.out.println("Stop thread Two");
            Thread.sleep(1000);
            ob2.myResume();
            System.out.println("Restart thread Two");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Waiting to completion of Threads");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
