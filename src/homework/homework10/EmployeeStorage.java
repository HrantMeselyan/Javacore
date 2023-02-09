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
            if (employee.getID().toLowerCase().contains(ID.toLowerCase())) {
                return (employee);
            }
        }
        return null;
    }

    public String checkID(String id) {
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            String tmp = employee.getID();
            if (id.equals(tmp)) {
                return id;
            }
        }
        return null;
    }

    public void lastCheck() {

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
