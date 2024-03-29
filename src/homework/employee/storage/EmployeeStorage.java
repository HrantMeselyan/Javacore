package homework.employee.storage;


import homework.employee.model.Company;
import homework.employee.model.Employee;

public class EmployeeStorage {
    private Employee[] array = new Employee[10];
    private int size;

    public void add(Employee item) {
        if (size == array.length) {
            extend();
        }
        array[size++] = item;
    }


    public void print() {
        if (size == 0) {
            System.out.println("Not found employees!");
        }
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }


    public void extend() {
        Employee[] array2 = new Employee[array.length + 10];
        System.arraycopy(array, 0, array2, 0, array.length);
        array = array2;
    }


    public Employee search(String id) {
        for (int i = 0; i < size; i++) {
            if (array[i].getID().toLowerCase().contains(id.toLowerCase())) {
                return (array[i]);
            }
        }
        return null;
    }

    public boolean checkID(String id) {
        boolean check = true;
        for (int i = 0; i < size; i++) {
            if (id.equals(array[i].getID())) {
                check = false;
                break;
            }
        }
        return check;
    }

    public void searchByCompany(Company company) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i].getCompany().equals(company)) {
                found = true;
                System.out.println(array[i].getName() + " " + array[i].getSurname());
                break;
            }
        }
        if (!found) {
            System.out.println("company " + company + "does not exits");
        }
    }

    public void searchByMaxAndMin(int min, int max) {
        boolean foundByRange = false;
        for (int i = 0; i < size; i++) {
            double salaryDouble = array[i].getSalary();
            int salaryInt = (int) salaryDouble;
            if (min <= salaryInt && max >= salaryInt) {
                System.out.println(array[i] + " ");
                foundByRange = true;
                break;
            }
        }
        if (!foundByRange) {
            System.out.println("Employee by salary range at " + min + " to " + max + " not found");
        }
    }

    public void changeEmployeePositionById(String id, String position) {
        boolean isChanged = false;
        for (int i = 0; i < size; i++) {
            String getId = array[i].getID();
            if (getId.equals(id)) {
                array[i].setPosition(position);
                System.out.println("Position is changed");
                isChanged = true;
                break;
            }
        }
        if (!isChanged) {
            System.out.println("Wrong id!");
        }
    }

    public void printActiveEmployees() {
        for (int i = 0; i < size; i++) {
            if (array[i].isActive()) {
                System.out.println(array[i] + " ");
            }
        }
    }

    public void inactiveEmployeeById(String id) {
        boolean inactivate = false;
        for (int i = 0; i < size; i++) {
            if (id.equals(array[i].getID()) && array[i].isActive()) {
                array[i].setActive(false);
                Company company = array[i].getCompany();
                company.setEmployeeCount(company.getEmployeeCount() - 1);
                System.out.println("Status changed!");
                inactivate = true;
                break;
            } else if (id.equals(array[i].getID()) && !array[i].isActive()) {
                System.out.println("Status is already false");
                inactivate = true;
                break;
            }
        }
        if (!inactivate){
            System.out.println("Wrong id!");
        }
    }

    public void activateEmployeeById(String employeeId) {
        boolean activate = false;
        for (int i = 0; i < size; i++) {
            if (employeeId.equals(array[i].getID()) && !array[i].isActive()) {
                array[i].setActive(true);
                Company company = array[i].getCompany();
                company.setEmployeeCount(company.getEmployeeCount() + 1);
                System.out.println("Status changed!");
                activate = true;
                break;
            } else if (employeeId.equals(array[i].getID()) && array[i].isActive()) {
                System.out.println("Status is already true");
                activate = true;
                break;
            }
        }
        if (!activate) {
            System.out.println("Wrong id!");
        }
    }
}