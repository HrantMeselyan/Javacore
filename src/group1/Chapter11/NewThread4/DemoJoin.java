package group1.Chapter11.NewThread4;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        NewThread ob3 = new NewThread("Three");

        System.out.println("Thread one is started: " + ob1.t.isAlive());
        System.out.println("Thread two is started: " + ob2.t.isAlive());
        System.out.println("Thread three is started: " + ob3.t.isAlive());

        try {
            System.out.println("Waiting for completion threads.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread one is started: " + ob1.t.isAlive());
        System.out.println("Thread two is started: " + ob2.t.isAlive());
        System.out.println("Thread three is started: " + ob3.t.isAlive());
        System.out.println("Main thread is ended.");
    }
}
