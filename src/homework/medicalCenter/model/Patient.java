package homework.medicalCenter.model;

import homework.medicalCenter.util.DataUtil;

import java.util.Date;
import java.util.Objects;

public class Patient extends Person {

    private String phone;
    private Doctor doctor;
    private Date registerDate;

    public Patient(String id, String name, String surname, String phone, Doctor doctor, Date registerDate) {
        super(id, name, surname);
        this.phone = phone;
        this.doctor = doctor;
        this.registerDate = registerDate;
    }

    public Patient() {
        super();
    }

    @Override
    public String toString() {
        return "Patient{" + super.toString() + ", " +
                "phone='" + phone + '\'' +
                ", doctor=" + doctor.getName() +
                ", registerDate=" + registerDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Patient patient = (Patient) o;
        return Objects.equals(phone, patient.phone) && Objects.equals(doctor, patient.doctor) && Objects.equals(registerDate, patient.registerDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), phone, doctor, registerDate);
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


