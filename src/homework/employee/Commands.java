package homework.employee;

public interface Commands {
    String EXIT = "0";
    String ADD = "1";
    String PRINT = "2";
    String EMPLOYEE_BY_ID = "3";
    String SEARCH_BY_COMPANY_NAME = "4";
    String SEARCH_BY_SALARY_RANGE = "5";
    String CHANGE_POSITION_BY_ID = "6";
    String PRINT_ACTIVE_EMPLOYEES = "7";
    String INACTIVE_BY_ID = "8";
    String ACTIVATE_BY_ID = "9";

    static void menu() {
        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + ADD + " for add employee");
        System.out.println("Please input " + PRINT + " for print all employee");
        System.out.println("Please inout " + EMPLOYEE_BY_ID + " for search employee by employee id");
        System.out.println("Please inout " + SEARCH_BY_COMPANY_NAME + " for search employee by company name");
        System.out.println("Please input " + SEARCH_BY_SALARY_RANGE + " for search employee by salary range");
        System.out.println("Please input " + CHANGE_POSITION_BY_ID + " for change employee position by id");
        System.out.println("Please input " + PRINT_ACTIVE_EMPLOYEES + " for print only active employees");
        System.out.println("Please input " + INACTIVE_BY_ID + " for inactive employee by id");
        System.out.println("Please input " + ACTIVATE_BY_ID + " for activate employee by id");
    }
}
