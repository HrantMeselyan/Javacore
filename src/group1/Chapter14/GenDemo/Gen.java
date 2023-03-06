package group1.Chapter14.GenDemo;

public class Gen<T> {
   private T ob;
    Gen(T object){
        ob = object;
    }

    T getOb(){
        return ob;
    }

    public void showType(){
        System.out.println("Type T is " + ob.getClass().getName());
    }
}
