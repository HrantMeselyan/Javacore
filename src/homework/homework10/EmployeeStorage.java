package homework.homework10;


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
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }


    public void extend() {
        Employee[] array2 = new Employee[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }


    public Employee search(String ID) {
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmplyeeID().toLowerCase().contains(ID.toLowerCase())) {
                return (employee);
            }
        }
        return null;
    }

    public boolean checkID(String id) {
        boolean check = true;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            String tmp = employee.getEmplyeeID();
            if (id.equals(tmp)) {
                check = false;
            }
        }
        return check;
    }

    public void searchByCompanyName(String companyNameSearch) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getCompany().toLowerCase().contains(companyNameSearch.toLowerCase())) {
                found = true;
                System.out.println(employee.getName() + " " + employee.getSurname());
            }
        }
        if (!found) {
            System.out.println("company " + companyNameSearch + "does not exits");
        }

    }

}
