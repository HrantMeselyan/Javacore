package group1.Chapter14.HierDemo;

public class Gen2 <T,V> extends Gen<T>{
    private V ob2;

    Gen2(T o, V o2){
        super(o);
        ob2 = o2;
    }

    V getOb2(){
        return ob2;
    }
}
