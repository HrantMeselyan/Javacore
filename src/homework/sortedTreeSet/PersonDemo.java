package homework.sortedTreeSet;

import java.util.Scanner;

public class PersonDemo {
    static Scanner scanner = new Scanner(System.in);
    static PersonStorage personStorage = new PersonStorage();

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 1 for add persons");
            System.out.println("Please input 2 for print persons");
            String command = scanner.nextLine();
            switch (command) {
                case "1":
                    addPerson();
                    break;
                case "2":
                    personStorage.personsPrint();
                    break;
            }
        }
    }

    private static void personsPrint() {
    }

    private static void addPerson() {
        System.out.println("Please input  id ,name, surname, age");
        String dates = scanner.nextLine();
        try {
            String[] split = dates.split(",");
            String age = split[3];
            Person person = new Person(split[0], split[1], split[2], Integer.parseInt(age));
            personStorage.add(person);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Try again!");
        }
        catch (NumberFormatException e){
            System.out.println("Try again!");
        }

    }
}