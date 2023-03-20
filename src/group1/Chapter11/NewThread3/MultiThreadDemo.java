package group1.Chapter11.NewThread3;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("One");
        new NewThread("Two");
        new NewThread("Three");

        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Main thread is ended.");
    }
}
