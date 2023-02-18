package homework.employee.storage;


import homework.employee.model.Company;

public class CompanyStorage {
    private Company[] companies = new Company[10];
    private int size;

    public void add(Company company) {
        if (size == companies.length) {
            extend();
        }
        companies[size++] = company;
    }


    public void print() {
        if (size == 0) {
            System.out.println("Not found Companies!");
        }
        for (int i = 0; i < size; i++) {
            System.out.println(companies[i] + " ");
        }
    }


    public void extend() {
        Company[] companies2 = new Company[companies.length + 10];
        System.arraycopy(companies, 0, companies2, 0, companies.length);
        companies = companies2;
    }


    public Company getCompanyById(String id) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getId().equals(id)) {
                return (companies[i]);
            }
        }
        return null;
    }

    public int getSize() {
        return size;
    }
}
