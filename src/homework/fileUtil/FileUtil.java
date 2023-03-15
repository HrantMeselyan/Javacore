package homework.fileUtil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);
    private static String directoryPath;
    private static File directory;

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 1 exit");
            System.out.println("Please input 2 for search file");
            System.out.println("Please input 3 for search by keyword");
            System.out.println("Please input 4 for search line by keyword");
            System.out.println("Please input 5 for print size of package");
            System.out.println("Please input 6 for create file with content");
            String command = scanner.nextLine();
            switch (command) {
                case "1":
                    isRun = false;
                    break;
                case "2":
                    System.out.println(searchFileInFolder());
                    break;
                case "3":
                    contentSearch();
                    break;
                case "4":
                    findLines();
                    break;
                case "5":
                    printSizeOfPackage();
                    break;
                case "6":
                    createFileWithContent();
                default:
                    System.out.println("Please try again!");
            }
        }
    }

    static boolean searchFileInFolder() {
        return (searchFileByFolder() && searchByFile());
    }

    private static boolean searchFileByFolder() {
        boolean found = false;
        System.out.println("Please input path");
        directoryPath = scanner.nextLine();
        File directory = new File(directoryPath);
        if (directory.exists()) {
            found = true;
        }
        return found;
    }

    private static boolean searchByFile() {
        boolean found = false;
        System.out.println("Please input file name for search");
        String path = scanner.nextLine();
        File file = new File(directoryPath + '\\' + path);
        if (file.exists()) {
            found = true;
        }
        return found;
    }


    private static void contentSearch() {
        System.out.println("Please input path");
        directoryPath = scanner.nextLine();
        directory = new File(directoryPath);
        if (directory.exists()) {
            searchByKeyword();
            return;
        }
        System.out.println("Please input correct directory!");
    }

    private static void searchByKeyword() {
        File[] list = directory.listFiles();
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        boolean found = false;
        for (File file : list) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                try (BufferedReader inputStream = new BufferedReader(new FileReader(file))) {
                    String line = "";
                    while ((line = inputStream.readLine()) != null) {
                        if (line.contains(keyword)) {
                            found = true;
                            System.out.println(file.getName());
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        if (!found) {
            System.out.println("Not found file by keyword " + keyword);
        }
    }


    static void findLines() {
        System.out.println("Please input path");
        String path = scanner.nextLine();
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        directory = new File(path);
        if (directory.isFile()) {
            try (BufferedReader inputStream = new BufferedReader(new FileReader(path))) {
                String line = "";
                while ((line = inputStream.readLine()) != null && line.contains(keyword)) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("Please input correct directory!");
        }
    }


    static void printSizeOfPackage() {
        System.out.println("Please input folder name");
        String folder = scanner.nextLine();
        directory = new File(folder);
        if (directory.exists()) {
            System.out.println(getSizeOfPackage());
            return;
        }
        System.out.println("Please input correct folder name");
    }

    private static long getSizeOfPackage() {
        File[] list = directory.listFiles();
        long length = 0;
        for (File file : list) {
            length += file.length();
        }
        return length;
    }

    static void createFileWithContent() {
        System.out.println("Please input path");
        String path = scanner.nextLine();
        System.out.println("Please input fileName");
        String fileName = scanner.nextLine();
        System.out.println("Please input content");
        String content = scanner.nextLine();
        File file = new File(path, fileName);
        try {
            if (file.createNewFile()) {
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(content);
                bw.close();
                System.out.println("File created and content written successfully!");
            } else {
                System.out.println("File is already exists!");
            }
        } catch (IOException e) {
            System.out.println("Please write correct!");
        }
    }
}