package group1.Chapter14.TwoGen;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<>(44, "Test");

        tgObj.showTypes();
        int v = tgObj.getOb();
        System.out.println("Value = " + v);
        String str = tgObj.getOb2();
        System.out.println("Value = " + str);
    }
}
