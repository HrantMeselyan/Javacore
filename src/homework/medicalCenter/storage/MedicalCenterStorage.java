package homework.medicalCenter.storage;

import homework.medicalCenter.Profession;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Person;
import homework.medicalCenter.util.DataUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MedicalCenterStorage {
    private List<Person> persons = new ArrayList<>();
    private int size;

    public void add(Person person) {
        persons.add(person);
        size++;
    }

    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            if (persons.get(i) instanceof Doctor) {
                System.out.println(persons.get(i));
            }
        }
    }

    public void deleteDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = persons.get(i);
            if (person instanceof Doctor && person.getId().equals(id)) {
                persons.remove(i);
                return;
            }
        }
        System.out.println("please try again!");
    }


    public void searchByProfession(String profession) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Person person =persons.get(i);
            if (persons.get(i) instanceof Doctor) {
                Doctor doctor = (Doctor) person;
                if (doctor.getProfession().name().equals(profession)) {
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
            Person person = persons.get(i);
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
            Person person = persons.get(i);
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
            Person person = persons.get(i);
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
            Person person = persons.get(i);
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
            if (persons.get(i) instanceof Doctor) {
                count++;
            }
        }
        return count;
    }

    public int getPatientsCount() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (persons.get(i) instanceof Patient) {
                count++;
            }
        }
        return count;
    }
}