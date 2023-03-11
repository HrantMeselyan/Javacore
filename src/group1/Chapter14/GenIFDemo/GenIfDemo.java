package group1.Chapter14.GenIFDemo;

public class GenIfDemo {
    public static void main(String[] args) {
        Integer[] iNumbers = {3,4,5,6,8,};
        Character[] chs = {'b','r','p','w'};

        MyClass<Integer> iOb = new MyClass<>(iNumbers);
        MyClass<Character> iOb2 = new MyClass<>(chs);

        System.out.println("max in array iNumber : " + iOb.max());
        System.out.println("min in array iNumber : " + iOb.min());

        System.out.println("max in array chs : " + iOb2.max());
        System.out.println("min in array chs : " + iOb2.min());
    }
}
