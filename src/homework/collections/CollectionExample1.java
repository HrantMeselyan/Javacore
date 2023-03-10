package homework.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionExample1 {
    static Scanner scanner = new Scanner(System.in);
    static List<String> names = new ArrayList<>();

    public static void main(String[] args) {
        names.add("Hrant");
        names.add("Poxos");
        names.add("Martiros");
        names.add("Petros");
        names.add("John");
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 1 for search name");
            System.out.println("Please input 2 for remove name");
            System.out.println("Please input 3 for save name");
            String command = scanner.nextLine();
            switch (command) {
                case "1":
                    searchName();
                    break;
                case "2":
                    removeName();
                    break;
                case "3":
                    saveName();
                    break;
                default:
                    System.out.println("Please try again");
            }
        }
    }

    private static void saveName() {
        System.out.println("Please input name");
        String name = scanner.nextLine();
        System.out.println("Please input index");
        String index = scanner.nextLine();
        int num = Integer.parseInt(index);
        try {
            names.add(num, name);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Please input small index than " + names.size());
        }
    }

    private static void removeName() {
        System.out.println("Please input name");
        String remove = scanner.nextLine();
        for (String name : names) {
            if (name.equals(remove)) {
                names.remove(remove);
                System.out.println(remove + " was deleted");
                print();
                return;
            }
        }
        System.out.println(remove + " not found");
    }

    private static void searchName() {
        System.out.println("Please input name");
        String name = scanner.nextLine();
        for (String s : names) {
            if (name.equals(s)) {
                System.out.println("Name is founded!");
                return;
            }
        }
        System.out.println("Names is not found!");
    }

    private static void print() {
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
