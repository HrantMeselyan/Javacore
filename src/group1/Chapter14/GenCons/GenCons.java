package group1.Chapter14.GenCons;

public class GenCons {
    private double val;

    <T extends Number> GenCons(T arg) {
        val = arg.doubleValue();
    }

    public void showVal(){
        System.out.println("val = " + val);
    }
}
