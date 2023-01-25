package group1.Chapter7;

public class VarArgs {
    static void vaTest(int... v) {
        System.out.print("count of arguments: " + v.length + " content: ");

        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(10,20,12);
        vaTest();
    }
}
