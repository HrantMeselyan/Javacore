package group1.Chapter7;

public class PassArray {
    static void vaTest(int v[]) {
        System.out.print("count of arguments : " + v.length + " content: ");

        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n1[] = {10};
        int n2[] = {1, 2, 3};
        int n3[] = {};
        vaTest(n1);
        vaTest(n2);
        vaTest(n3);
    }
}
