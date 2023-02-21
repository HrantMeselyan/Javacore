package homework.medicalCenter.storage;

import homework.medicalCenter.model.Patient;
import homework.medicalCenter.model.Doctor;

public class MedicalCenterStorage {

    private Doctor[] doctors = new Doctor[10];
    private Patient[] patients = new Patient[10];
    private int patientsCount;
    private int doctorsCount;

    public void add(Doctor item) {
        if (doctorsCount == doctors.length) {
            extend();
        }
        doctors[doctorsCount++] = item;
    }

    public void add(Patient item) {
        if (patientsCount == patients.length) {
            extend();
        }
        patients[patientsCount++] = item;
    }


    public void printDoctors() {
        if (doctorsCount == 0) {
            System.out.println("Not found doctors!");
        }
        for (int i = 0; i < doctorsCount; i++) {
            System.out.println(doctors[i] + " ");
        }
    }


    public void extend() {
        Doctor[] array2 = new Doctor[doctors.length + 10];
        System.arraycopy(doctors, 0, array2, 0, doctors.length);
        doctors = array2;
    }


    public void deleteDoctorById(String id) {
        for (int i = 0; i < doctorsCount; i++) {
            if (doctors[i].getId().equals(id)) {
                doctors[i] = doctors[i + 1];
                System.out.println("Doctor by " + id + " deleted!");
                break;
            } else {
                System.out.println("please try again!");
            }
        }
        doctorsCount--;
    }


    public void searchByProfession(String profession) {
        boolean found = false;
        for (int i = 0; i < doctorsCount; i++) {
            if (doctors[i].getProfession().equals(profession)) {
                found = true;
                System.out.println(doctors[i]);
                break;
            }
        }
        if (!found) {
            System.out.println("doctor by profession " + profession + " does not exits");
        }
    }

    public Doctor getDoctorById(String id) {
        for (int i = 0; i < doctorsCount; i++) {
            if (doctors[i].getId().equals(id)) {
                return (doctors[i]);
            }
        }
        return null;
    }

    public int getDoctorsCount() {
        return doctorsCount;
    }

    public int getPatientsCount() {
        return patientsCount;
    }

    public void changeDoctorDates(String id, String s, String s1, String s2, String s3, String s4) {
        for (int i = 0; i < doctorsCount; i++) {

        }
    }
}
