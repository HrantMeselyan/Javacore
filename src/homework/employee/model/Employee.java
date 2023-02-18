package homework.employee.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import homework.employee.util.DataUtil;


public class Employee {
    private String name;
    private String surname;
    private String id;
    private double salary;
    private Company company;
    private String position;
    private boolean active = true;
    private Date registerDate;
    private Date dateOfBirthday;


    public Employee(String name, String surname, String id, double salary, Company company, String position, Date registerDate, Date dateOfBirthday) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.salary = salary;
        this.company = company;
        this.position = position;
        this.registerDate = registerDate;
        this.dateOfBirthday = dateOfBirthday;
    }

    public Employee() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && active == employee.active && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(id, employee.id) && Objects.equals(company, employee.company) && Objects.equals(position, employee.position) && Objects.equals(registerDate, employee.registerDate) && Objects.equals(dateOfBirthday, employee.dateOfBirthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, id, salary, company, position, active, registerDate, dateOfBirthday);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                ", company='" + company.getName() + '\'' +
                ", position='" + position + '\'' +
                ", active=" + active +
                ", registerDate=" +  DataUtil.registerDate(registerDate) +
                ", dateOfBirthday=" +  DataUtil.dateOfBirthday(dateOfBirthday) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isActive() {
        return active;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(Date dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}