package homework.employee.storage;


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
            System.out.println("NOT FOUND EMPLOYEES!");
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

    public void searchByCompanyName(String companyNameSearch) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i].getCompany().toLowerCase().contains(companyNameSearch.toLowerCase())) {
                found = true;
                System.out.println(array[i].getName() + " " + array[i].getSurname());
            }
        }
        if (!found) {
            System.out.println("company " + companyNameSearch + "does not exits");
        }
    }

    public void searchByMaxAndMin(int min, int max) {
        for (int i = 0; i < size; i++) {
            double salaryDouble = array[i].getSalary();
            int salaryInt = (int) salaryDouble;
            if (min <= salaryInt && max >= salaryInt)
                System.out.println(array[i] + " ");
        }
    }

    public void changeEmployeePositionById(String id, String position) {
        for (int i = 0; i < size; i++) {
            String getId = array[i].getID();
            if (getId.equals(id)) {
                array[i].setPosition(position);
            }
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
        for (int i = 0; i < size; i++) {
            if (id.equals(array[i].getID()) && array[i].isActive()) {
                array[i].setActive(false);
                System.out.println("Status changed!");
            } else if (id.equals(array[i].getID()) && !array[i].isActive()) {
                System.out.println("Status is already false");
                break;
            } else {
                System.out.println("Wrong id please try again");
                return;
            }
        }
    }

    public void activateEmployeeById(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employeeId.equals(array[i].getID()) && !array[i].isActive()) {
                array[i].setActive(true);
                System.out.println("Status changed!");
            } else if (employeeId.equals(array[i].getID()) && array[i].isActive()) {
                System.out.println("Status is already true");
                break;
            } else {
                System.out.println("Wrong id please try again");
                return;
            }
        }
    }
}