package homework.medicalCenter.model;

import java.util.Date;
import java.util.Objects;

public class Patient {
    private String id;
    private String name;
    private String surname;
    private String phone;
    private Doctor doctor;
    private Date registerDate;

    public Patient(String id, String name, String surname, String phone, Doctor doctor, Date registerDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.doctor = doctor;
        this.registerDate = registerDate;
    }

    public Patient() {

    }

    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", doctor=" + doctor +
                ", registerDate=" + registerDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(id, patient.id) && Objects.equals(name, patient.name) && Objects.equals(surname, patient.surname) && Objects.equals(phone, patient.phone) && Objects.equals(doctor, patient.doctor) && Objects.equals(registerDate, patient.registerDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, phone, doctor, registerDate);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
}
