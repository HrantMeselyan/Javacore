package group1.Chapter9.DefaultMethod;

public class DefaultDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        MyIFImp2 obj2 = new MyIFImp2();

        System.out.println(obj.getNumber());
        System.out.println(obj.getString());

        System.out.println(obj2.getNumber());
        System.out.println(obj2.getString());
    }
}
