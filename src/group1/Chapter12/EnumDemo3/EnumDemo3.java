package group1.Chapter12.EnumDemo3;

public class EnumDemo3 {
    public static void main(String[] args) {

        System.out.println("Apple Winesap price  = " + Apple.WINESAP.getPrice());
        System.out.println("Price of all apples: ");
        for (Apple allApples : Apple.values()) {
            System.out.println(allApples + " price = " + allApples.getPrice());
        }
    }
}
