package group1.Chapter14.BridgeDemo;

public class Gen <T>{
    T ob;

    Gen(T o){
        ob = o;
    }
    T getOb(){
        return ob;
    }
}
