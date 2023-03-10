package homework.medicalCenter;

import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.model.Person;
import homework.medicalCenter.storage.MedicalCenterStorage;

import java.util.Date;
import java.util.Scanner;

public class MedicalCenterDemo implements homework.medicalCenter.Commands {

    private final static MedicalCenterStorage<Person> medicalCenterStoragePerson = new MedicalCenterStorage<>();
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
        int patientsCount = medicalCenterStoragePerson.getPatientsCount();
        if (patientsCount != 0) {
            medicalCenterStoragePerson.printTodayPatients();
        } else {
            System.out.println("Patients not exists");
        }
    }

    private static void printAllPatientsByDoctor() {
        System.out.println("Please choose doctor by id");
        medicalCenterStoragePerson.printDoctors();
        String doctorId = scanner.nextLine();
        Doctor doctorById = medicalCenterStoragePerson.getDoctorById(doctorId);
        if (doctorById != null) {
            medicalCenterStoragePerson.printAllPatientsByDoctor(doctorById);
        } else {
            System.out.println("Doctors does not exists");
        }
    }

    private static void addPatient() {
        if (medicalCenterStoragePerson.getDoctorsCount() == 0) {
            System.out.println("Please add doctor!");
            return;
        }
        medicalCenterStoragePerson.printDoctors();
        System.out.println("please choose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = medicalCenterStoragePerson.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("Please input id,name,surname,phone");
            String patientDataStr = scanner.nextLine();
            String[] patientData = patientDataStr.split(",");
            Date date = new Date();
            try {
                Patient patient = new Patient(patientData[0], patientData[1], patientData[2], patientData[3], doctorById, date);
                medicalCenterStoragePerson.add(patient);
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
        medicalCenterStoragePerson.printDoctors();
        String idForChangeDoctorDate = scanner.nextLine();
        if (medicalCenterStoragePerson.getDoctorById(idForChangeDoctorDate) != null) {
            System.out.println("Please input new name,surname,mail,phoneNumber,profession  for change doctor dates");
            String changeDoctorDataById = scanner.nextLine();
            String[] changeDoctorDate = changeDoctorDataById.split(",");
            try {
                medicalCenterStoragePerson.changeDoctorDates(idForChangeDoctorDate, changeDoctorDate[0], changeDoctorDate[1], changeDoctorDate[2], changeDoctorDate[3], Profession.valueOf(changeDoctorDate[4]));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please input correct dates!");
            } catch (IllegalArgumentException e) {
                System.out.println("Please write correct profession");
            }
        } else {
            System.out.println("Wrong id please try again!");
        }
    }

    private static void deleteDoctorById() {
        System.out.println("please input doctor id for delete");
        medicalCenterStoragePerson.printDoctors();
        String idForDelete = scanner.nextLine();
        medicalCenterStoragePerson.deleteDoctorById(idForDelete);
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input profession");
        String searchByProfession = scanner.nextLine();
        medicalCenterStoragePerson.searchByProfession(searchByProfession);

    }

    private static void addDoctor() {
        System.out.println("Please input id,name,surname,email,phoneNumber");
        String doctorDataStr = scanner.nextLine();
        String[] doctorData = doctorDataStr.split(",");
        String doctorId = doctorData[0];
        Doctor doctorById = medicalCenterStoragePerson.getDoctorById(doctorId);
        System.out.println("Please choose doctor profession from : ");
        Profession[] values = Profession.values();
        for (Profession value : values) {
            System.out.print(value + " ");
        }
        String professions = scanner.nextLine();
        try {
            if (doctorById == null) {
                Doctor doctor = new Doctor(doctorId, doctorData[1], doctorData[2], doctorData[3], doctorData[4], Profession.valueOf(professions));
                medicalCenterStoragePerson.add(doctor);
                System.out.println("Doctor was added!");
            } else {
                System.out.println("Doctor with id" + doctorId + "already used!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please try again!");
        } catch (IllegalArgumentException e) {
            System.out.println("Please choose correct profession!");
        }

    }
}
