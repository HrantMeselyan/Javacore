package group1.Chapter14.NonGen;

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb = new NonGen(88);
        iOb.showType();
        int v = (Integer) iOb.getOb();
        System.out.println("Value : " + v);

        NonGen strOb = new NonGen("Test Non Generics");
        strOb.showType();
        String str = (String) strOb.getOb();
        System.out.println("Value : " + str);
        iOb = strOb;
//     ERROR!   v = (Integer) iOb.getOb();
    }
}
