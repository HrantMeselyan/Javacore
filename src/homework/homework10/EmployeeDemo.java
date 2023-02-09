package homework.homework10;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for print all employee");
            System.out.println("Please inout 3 for search employee by employee ID");
            System.out.println("Please inout 4 for  search employee by company name");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("please input name");
                    String name = scanner.nextLine();
                    System.out.println("please input surname");
                    String surname = scanner.nextLine();
                    System.out.println("please input author id");
                    String id = scanner.nextLine();
                    System.out.println("please input salary");
                    String salary = scanner.nextLine();
                    System.out.println("Please input company name");
                    String companyName = scanner.nextLine();
                    System.out.println("Please input position");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(name, surname, employeeStorage.checkID(id), Double.parseDouble(salary), companyName, position);
                    employeeStorage.add(employee);
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("Please input employee ID");
                    String ID = scanner.nextLine();
                    System.out.println(employeeStorage.search(ID));
                    break;
                case "4":
                    System.out.println("Please input company name");
                    String companyNameSearch = scanner.nextLine();
                    employeeStorage.searchByCompanyName(companyNameSearch);
                    break;
                default:
                    System.out.println("Wrong command .Please try again");

            }
        }
    }
}
