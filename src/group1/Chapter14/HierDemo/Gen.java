package group1.Chapter14.HierDemo;

public class Gen<T> {
    private T ob;

    Gen(T ob) {
        this.ob = ob;
    }

    T getOb(){
        return ob;
    }
}
