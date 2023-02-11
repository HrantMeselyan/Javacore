package group1.Chapter9.clientInterface;

public class Client implements CallBack{
    public void callback(int p){
        System.out.println("Method callback(), " + "calling value " + p);
    }

    void nonIfaceMeth(){
        System.out.println("Not use interface");
    }
}
