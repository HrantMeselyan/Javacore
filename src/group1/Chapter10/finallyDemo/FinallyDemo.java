package group1.Chapter10.finallyDemo;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("In body procA()");
            throw new RuntimeException("Demonstration");
        } finally {
            System.out.println("Block operator finally");
        }
    }

    static void procB() {
        try {
            System.out.println("in body procB()");
            return;
        } finally {
            System.out.println("Block operator finally in method procB()");
        }
    }

    static void procC() {
        try {
            System.out.println("in body procC()");
        } finally {
            System.out.println("Block operator finally in method procC()");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        }catch (Exception e){
            System.out.println("Exception is intercepted");
        }
        procB();
        procC();
    }
}
