package homework.homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator result = new Calculator();

        int sum = result.plus(10, 5);
        System.out.println("plus : " + sum);

        sum = result.minus(6, 99);
        System.out.println("minus : " + sum);

        sum = result.divide(900, 2);
        System.out.println("divide : " + sum);

        sum = result.multiply(80, 2);
        System.out.println("multiply : " + sum);
    }
}
