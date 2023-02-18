package homework.employee;

import homework.employee.model.Employee;
import homework.employee.storage.EmployeeStorage;
import homework.employee.util.DataUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo implements Commands {
    private static final Scanner scanner = new Scanner(System.in);
    private static final EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        while (isRun) {
            Commands.menu();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD:
                    employeeAdd();
                    break;
                case PRINT:
                    employeeStorage.print();
                    break;
                case EMPLOYEE_BY_ID:
                    System.out.println("Please input employee id");
                    String idForSearch = scanner.nextLine();
                    System.out.println(employeeStorage.search(idForSearch));
                    break;
                case SEARCH_BY_COMPANY_NAME:
                    System.out.println("Please input company name");
                    String companyNameSearch = scanner.nextLine();
                    employeeStorage.searchByCompanyName(companyNameSearch);
                    break;
                case SEARCH_BY_SALARY_RANGE:
                    searchByRange();
                    break;
                case CHANGE_POSITION_BY_ID:
                    changeEmployeePosition();
                    break;
                case PRINT_ACTIVE_EMPLOYEES:
                    employeeStorage.printActiveEmployees();
                    break;
                case INACTIVE_BY_ID:
                    System.out.println("Please input id for inactive employee");
                    String id = scanner.nextLine();
                    employeeStorage.inactiveEmployeeById(id);
                    break;
                case ACTIVATE_BY_ID:
                    System.out.println("Please input id for activate employee");
                    String employeeId = scanner.nextLine();
                    employeeStorage.activateEmployeeById(employeeId);
                    break;
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
        String salaryInput = scanner.nextLine();


        System.out.println("Please input company name");
        String companyName = scanner.nextLine();

        System.out.println("Please input position");
        String position = scanner.nextLine();


        System.out.println("Please input employee birthday (12/02/2023)");
        String dateOfBirthdayStr = scanner.nextLine();

        Date date = new Date();

        try {
            Employee employee = new Employee(name, surname, id, Double.parseDouble(salaryInput), companyName, position, date,  DataUtil.stringToDate(dateOfBirthdayStr));
            employeeStorage.add(employee);
            System.out.println("Employee is added!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for salary! Please enter a valid number.");
        } catch (ParseException e) {
            System.out.println("Invalid input for employee Birthday date! Please enter a valid Date");
        }
    }

    private static void searchByRange() {
        System.out.println("Please input minimum");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input maximum");
        int max = Integer.parseInt(scanner.nextLine());
        employeeStorage.searchByMaxAndMin(min, max);
    }

    private static void changeEmployeePosition() {
        System.out.println("Please input id for change position");
        String id = scanner.nextLine();
        System.out.println("Please input position");
        String position = scanner.nextLine();
        employeeStorage.changeEmployeePositionById(id, position);
        System.out.println("Position is changed");
    }

}
