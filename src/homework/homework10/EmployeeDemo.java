package homework.homework10;

import java.util.Scanner;

public class EmployeeDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static Employee employee;

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for print all employee");
            System.out.println("Please inout 3 for search employee by employee ID");
            System.out.println("Please inout 4 for  search employee by company name");
            System.out.println("Please input 5 for search employee by salary range");
            System.out.println("Please input 6 for change employee position by id");
            System.out.println("Please input 7 for print only active employees");
            System.out.println("Please input 8 for inactive employee by id");
            System.out.println("Please input 9 for activate employee by id");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    employeeAdd();
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
                case "5":
                    searchByRange();
                    break;
                case "6":
                    changeEmployeePosition();
                    break;
                case "7":
                    employeeStorage.printActiveEmployees();
                    break;
                case "8":
                    System.out.println("Please input id for inactive employee");
                    String id = scanner.nextLine();
                    employeeStorage.inactiveEmployeeById(id);
                    break;
                case "9":
                    System.out.println("Please input id for activate employee");
                    String activateId = scanner.nextLine();
                    employeeStorage.activateEmployeeById(activateId);
                default:
                    System.out.println("Wrong command .Please try again");

            }
        }
    }


    private static void employeeAdd() {
        System.out.println("please input name");
        String name = scanner.nextLine();
        System.out.println("please input surname");
        String surname = scanner.nextLine();
        System.out.println("please input author id");
        String id = scanner.nextLine();
        if (!employeeStorage.checkID(id)) {
            System.out.println("Wrong index");
            return;
        }
        System.out.println("please input salary");
        String salary = scanner.nextLine();
        System.out.println("Please input company name");
        String companyName = scanner.nextLine();
        System.out.println("Please input position");
        String position = scanner.nextLine();
        employee = new Employee(name, surname, id, Double.parseDouble(salary), companyName, position);
        employeeStorage.add(employee);
    }
    private static void searchByRange() {
        System.out.println("Please input minimum");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input maximum");
        int max = Integer.parseInt(scanner.nextLine());
        System.out.println(employeeStorage.searchByMaxAndMin(min, max));
    }
    private static void changeEmployeePosition() {
        System.out.println("Please input id for change position");
        String id = scanner.nextLine();
        System.out.println("Please input position");
        String position = scanner.nextLine();
        employeeStorage.changeEmployeePositionById(id,position);
    }
}
