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


    public void search(String ID) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmplyeeID().toLowerCase().contains(ID.toLowerCase())) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println("employee" + ID + "does not exits");
        }

    }

    public void searchByCompanyName(String companyNameSearch) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getCompany().toLowerCase().contains(companyNameSearch.toLowerCase())) {
                found = true;
                System.out.println(employee.getName() + employee.getSurname());
            }
        }
        if (!found) {
            System.out.println("company " + companyNameSearch + "does not exits");
        }

    }

}
