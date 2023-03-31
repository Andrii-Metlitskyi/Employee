import java.io.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Taras", 05 / 10 / 2003, new double[]{2000, 2500, 3000, 3500, 4000, 4500});
        Employee employee2 = new Employee("Artem", 06 / 11 / 1976, new double[]{1800, 1900, 4000, 2100, 2200, 2300});
        Employee employee3 = new Employee("Oleg", 11 / 03 / 1999, new double[]{2200, 2400, 2600, 2800, 3000, 3200});
        File file = new File("text document");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(employee1.getName() + ": " + employee1.getAverageSalary(employee1.getSalaries()) + "\n");
            writer.write(employee2.getName() + ": " + employee2.getAverageSalary(employee2.getSalaries()) + "\n");
            writer.write(employee3.getName() + ": " + employee3.getAverageSalary(employee3.getSalaries()) + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }
        try {
            FileReader reader = new FileReader("text document");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}