package group1.Chapter14.BridgeDemo;

public class Gen2 <T> extends Gen<String>{
    Gen2(String o){
        super(o);
    }

    String getOb(){
        System.out.println("This is method Sting getOb() ");
        return ob;
    }
}
