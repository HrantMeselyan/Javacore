package homework.medicalCenter.model;

import homework.medicalCenter.Profession;

import java.util.Objects;

public class Doctor extends Person {

    private String email;
    private String phoneNumber;
    private Profession profession;


    public Doctor(String id, String name, String surname, String email, String phoneNumber, Profession profession) {
        super(id, name, surname);
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.profession = profession;
    }

    public Doctor() {
        super();
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", profession=" + profession +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(email, doctor.email) && Objects.equals(phoneNumber, doctor.phoneNumber) && Objects.equals(profession, doctor.profession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), email, phoneNumber, profession);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }
}