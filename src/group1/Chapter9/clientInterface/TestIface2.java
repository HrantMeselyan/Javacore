package group1.Chapter9.clientInterface;

public class TestIface2 {
    public static void main(String[] args) {
        CallBack c = new Client();
        CallBack ob = new AnotherClient();

        c.callback(42);
        c = ob;
        c.callback(42);
    }
}
