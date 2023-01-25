package group1.Chapter7;

public class VarArgs3 {
    static void vaTest(int... v) {
        System.out.print("count of arguments: " + v.length + " content: ");

        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("count of arguments: " + v.length + " content: ");

        for (boolean i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void vaTest(String msg, int... v) {
        System.out.print("vaTest(String, int ... v) " + v.length + " content: ");
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest("check",10,20);
        vaTest(true,true,false);
    }
}
