package homework.medicalCenter;

import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.storage.MedicalCenterStorage;

import java.util.Date;
import java.util.Scanner;

public class MedicalCenterDemo implements homework.medicalCenter.Commands {
    private final static MedicalCenterStorage medicalCenterStorage = new MedicalCenterStorage();
    private static Doctor doctor = new Doctor();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_DATA_BY_ID:
                    changeDoctorDataById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatientsByDoctor();
                    break;
                case PRINT_TODAY_PATIENTS:
                    printTodayPatients();
                    break;
                default:
                    System.out.println("Wrong command .Please try again");
            }
        }
    }

    private static void printTodayPatients() {
        int patientsCount = medicalCenterStorage.getPatientsCount();
        if (patientsCount != 0) {
            medicalCenterStorage.printTodayPatients();
        } else {
            System.out.println("Patients not exists");
        }
    }

    private static void printAllPatientsByDoctor() {
        System.out.println("Please choose doctor by id");
        medicalCenterStorage.printDoctors();
        String doctorId = scanner.nextLine();
        Doctor doctorById = medicalCenterStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            medicalCenterStorage.printAllPatientsByDoctorId(doctorById);
        } else {
            System.out.println("Doctors does not exists");
        }
    }

    private static void addPatient() {
        if (medicalCenterStorage.getDoctorsCount() == 0) {
            System.out.println("Please add doctor!");
            return;
        }
        medicalCenterStorage.printDoctors();
        System.out.println("please choose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = medicalCenterStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("Please input id,name,surname,phone");
            String patientDataStr = scanner.nextLine();
            String[] patientData = patientDataStr.split(",");
            Date date = new Date();
            try {
                Patient patient = new Patient(patientData[0], patientData[1], patientData[2], patientData[3], doctorById, date);
                medicalCenterStorage.add(patient);
                System.out.println("Patient was added!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please try again");
            }
        } else {
            System.out.println("Wrong id please try again!");
        }
    }

    private static void changeDoctorDataById() {
        System.out.println("please input doctor id");
        medicalCenterStorage.printDoctors();
        String idForChangeDoctorDate = scanner.nextLine();
        System.out.println("Please input new name,surname,mail,phoneNumber,profession for change doctor dates");
        String changeDoctorDataById = scanner.nextLine();
        String changeDoctorDate[] = changeDoctorDataById.split(",");
        try {
            medicalCenterStorage.changeDoctorDates(idForChangeDoctorDate, changeDoctorDate[0], changeDoctorDate[1], changeDoctorDate[2], changeDoctorDate[3], changeDoctorDate[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please input correct dates!");
        }
    }

    private static void deleteDoctorById() {
        System.out.println("please input doctor id for delete");
        medicalCenterStorage.printDoctors();
        String idForDelete = scanner.nextLine();
        medicalCenterStorage.deleteDoctorById(idForDelete);
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input profession");
        String searchByProfession = scanner.nextLine();
        medicalCenterStorage.searchByProfession(searchByProfession);

    }

    private static void addDoctor() {
        System.out.println("Please input id,name,surname,email,phoneNumber,profession");
        String doctorDataStr = scanner.nextLine();
        String[] doctorData = doctorDataStr.split(",");
        String doctorId = doctorData[0];
        Doctor doctorById = medicalCenterStorage.getDoctorById(doctorId);
        try {
            if (doctorById == null) {
                Doctor doctor = new Doctor(doctorId, doctorData[1], doctorData[2], doctorData[3], doctorData[4], doctorData[5]);
                medicalCenterStorage.add(doctor);
                System.out.println("Doctor was added!");
            } else {
                System.out.println("Doctor with id" + doctorId + "already used!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please try again!");
        }

    }
}
