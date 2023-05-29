import java.io.*;
import java.util.Scanner;

class Record {
    public void readFromFile() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the name of the file to read from: ");
            String fileName = reader.readLine();

            File file = new File(fileName);
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    public void writeToFile() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the name of the file to write to: ");
            String fileName = reader.readLine();

            FileWriter fw = new FileWriter(fileName);
            System.out.print("Enter the text to write to the file: ");
            String text = reader.readLine();

            fw.write(text);
            fw.close();

            System.out.println("Text written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Record record = new Record();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Read from file");
        System.out.println("2. Write to file");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                record.readFromFile();
                break;
            case 2:
                record.writeToFile();
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        scanner.close();
    }
}