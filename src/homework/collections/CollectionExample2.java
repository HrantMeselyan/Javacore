package homework.collections;

import java.util.HashSet;
import java.util.Scanner;

public class CollectionExample2 {
    static Scanner scanner = new Scanner(System.in);
    static HashSet<String> names = new HashSet<>();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 1 for add names");
            String command = scanner.nextLine();
            switch (command) {
                case "1":
                    addNames();
                    break;
                default:
                    System.out.println("Please try again");
            }
        }
    }

    private static void addNames() {
        System.out.println("Input names");
        String name = scanner.nextLine();
        String[] split = name.split(",");
        for (int i = 0; i < split.length; i++) {
            names.add(split[i]);
        }
        print();
    }
    private static void print(){
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
