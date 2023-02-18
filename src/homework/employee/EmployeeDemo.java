package homework.employee;

import homework.employee.model.Company;
import homework.employee.model.Employee;
import homework.employee.storage.CompanyStorage;
import homework.employee.storage.EmployeeStorage;
import homework.employee.util.DataUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo implements Commands {
    private static final Scanner scanner = new Scanner(System.in);
    private static final EmployeeStorage employeeStorage = new EmployeeStorage();
    private static final CompanyStorage companyStorage = new CompanyStorage();

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    employeeAdd();
                    break;
                case ADD_COMPANY:
                    addCompany();
                    break;
                case PRINT_EMPLOYEES:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    System.out.println("Please input employee id");
                    String idForSearch = scanner.nextLine();
                    System.out.println(employeeStorage.search(idForSearch));
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_ID:
                    searchEmployeeByCompanyId();
                    break;
                case SEARCH_EMPLOYEE_BY_SALARY_RANGE:
                    searchByRange();
                    break;
                case CHANGE_EMPLOYEE_POSITION_BY_ID:
                    changeEmployeePosition();
                    break;
                case PRINT_ONLY_ACTIVE_EMPLOYEES:
                    employeeStorage.printActiveEmployees();
                    break;
                case INACTIVE_EMPLOYEE_BY_ID:
                    System.out.println("Please input id for inactive employee");
                    String id = scanner.nextLine();
                    employeeStorage.inactiveEmployeeById(id);
                    break;
                case ACTIVATE_EMPLOYEE_BY_ID:
                    System.out.println("Please input id for activate employee");
                    String employeeId = scanner.nextLine();
                    employeeStorage.activateEmployeeById(employeeId);
                    break;
                case PRINT_ALL_COMPANIES:
                    companyStorage.print();
                    break;
                default:
                    System.out.println("Wrong command .Please try again");

            }
        }
    }

    private static void addCompany() {
        System.out.println("Please input id,name,address,phoneNumber");
        String companyDataStr = scanner.nextLine();
        String[] companyData = companyDataStr.split(",");
        String companyId = companyData[0];
        Company companyById = companyStorage.getCompanyById(companyId);
        try {
            if (companyById == null) {
                Company company = new Company(companyId, companyData[1], companyData[2], companyData[3]);
                companyStorage.add(company);
                System.out.println("Company was added!");
            } else {
                System.out.println("Company with " + companyId + " already exists");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("please fill to the end");
        }
    }

    private static void employeeAdd() {
        if (companyStorage.getSize() == 0) {
            System.out.println("Please add company!");
            return;
        }
        companyStorage.print();
        System.out.println("please choose company id");
        String companyId = scanner.nextLine();
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById != null) {

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

            System.out.println("Please input position");
            String position = scanner.nextLine();

            System.out.println("Please input employee birthday (12/02/2023)");
            String dateOfBirthdayStr = scanner.nextLine();

            Date date = new Date();

            try {
                Employee employee = new Employee(name, surname, id, Double.parseDouble(salaryInput), companyById, position, date, DataUtil.stringToDate(dateOfBirthdayStr));
                employeeStorage.add(employee);
                System.out.println("Employee is added!");
                companyById.setEmployeeCount(companyById.getEmployeeCount() + 1);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for salary! Please enter a valid number.");
            } catch (ParseException e) {
                System.out.println("Invalid input for employee Birthday date! Please enter a valid Date");
            }
        } else {
            System.out.println("Wrong company id!");
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

    private static void searchEmployeeByCompanyId() {
        if (companyStorage.getSize() != 0) {
            companyStorage.print();
            System.out.println("Please input company id");
            String companyId = scanner.nextLine();
            Company companyById = companyStorage.getCompanyById(companyId);
            if (companyById != null) {
                employeeStorage.searchByCompany(companyById);
            } else {
                System.out.println("Company does not exists!");
            }
        }
    }

}
