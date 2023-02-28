package group1.Chapter12.EnumDemo2;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;

        System.out.println("Constants of enum Apple:");

        Apple[] allApples = Apple.values();
        for (Apple allApple : allApples) {
            System.out.println(allApple);
        }
        System.out.println();

        ap = Apple.valueOf("WINESAP");
        System.out.println("Variable ap  = " + ap);
    }
}
