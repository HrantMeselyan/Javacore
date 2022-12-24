package group1.Chapter4;

public class Ternary {
    public static void main(String[] args) {
        int i = 10;
        int k;
        k = i < 0 ? -i : i;
        System.out.print("Absolute variable ");
        System.out.println(i + " = " + k);

        i = -10;
        k = i < 0 ? -i : i;
        System.out.print("Absolute variable ");
        System.out.println(i + " = " + k);
    }
}
