package group1.Chapter9.clientInterface;

public class AnotherClient implements CallBack {
    public void callback(int p) {
        System.out.println("another one variant callback()");
        System.out.println("p square equals " + (p * p));
    }
}
