package homework.homework7;

public class Calculator {

    int plus(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    int minus(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    int divide(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            System.out.println("is not divisible by 0");
            return -1;
        }
        return firstNumber / secondNumber;

    }

    int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}

