package homework.medicalCenter.storage;

import homework.medicalCenter.Profession;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Person;
import homework.medicalCenter.util.DataUtil;

import java.util.Date;

public class MedicalCenterStorage {
    private Person[] persons = new Person[20];
    private int size;

    public void add(Person person) {
        if (size == persons.length) {
            extend();
        }
        persons[size++] = person;
    }

    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor) {
                System.out.println(persons[i]);
            }
        }
    }

    public void printPatients() {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                System.out.println(persons[i]);
            }
        }
    }

    public void extend() {
        Person[] array2 = new Person[persons.length + 10];
        System.arraycopy(persons, 0, array2, 0, persons.length);
        persons = array2;
    }


    public void deleteDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor && person.getId().equals(id)) {
                persons[i] = persons[i + 1];
                System.out.println("Doctor by " + id + " deleted!");
                size--;
                return;
            }
        }
        System.out.println("please try again!");
    }


    public void searchByProfession(String profession) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (persons[i] instanceof Doctor) {
                Doctor doctor = (Doctor) person;
                if (doctor.getProfession().equals(profession)) {
                    found = true;
                    System.out.println(doctor);
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("doctor by profession " + profession + " does not exits");
        }
    }

    public Doctor getDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor) {
                Doctor doctor = (Doctor) person;
                if (doctor.getId().equals(id)) {
                    return (doctor);
                }
            }
        }
        return null;
    }

    public void changeDoctorDates(String id, String name, String surname, String mail, String phoneNumber, Profession profession) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor) {
                Doctor doctor = (Doctor) person;
                if (doctor.getId().equals(id)) {
                    doctor.setName(name);
                    doctor.setSurname(surname);
                    doctor.setEmail(mail);
                    doctor.setPhoneNumber(phoneNumber);
                    doctor.setProfession(profession);
                    System.out.println("Dates changed!");
                    break;
                }
            }
        }
    }

    public void printAllPatientsByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Patient) {
                Patient patient = (Patient) person;
                if (patient.getDoctor().equals(doctor)) {
                    System.out.println(patient);
                }
            }
        }
    }

    public void printTodayPatients() {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Patient) {
                Patient patient = (Patient) person;
                Date date = new Date();
                if (DataUtil.isSameDay(date, patient.getRegisterDate())) {
                    System.out.println(patient);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Today patients not found!");
        }
    }

    public int getDoctorsCount() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor) {
                count++;
            }
        }
        return count;
    }
    public int getPatientsCount() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                count++;
            }
        }
        return count;
    }
}