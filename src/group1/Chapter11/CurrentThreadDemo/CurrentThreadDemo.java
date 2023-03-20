package group1.Chapter11.CurrentThreadDemo;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Thread : " + t);

        t.setName("My Thread");
        System.out.println("Name of thread after set : " + t);

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ");
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
