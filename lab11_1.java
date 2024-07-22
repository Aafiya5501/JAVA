import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int age;
    private String department;

    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Department: " + department;
    }
}

public class StudentManager {
    private static final String FILENAME = "students.txt";

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Read student information from file
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0].trim();
                    int age = Integer.parseInt(parts[1].trim());
                    String department = parts[2].trim();
                    students.add(new Student(name, age, department));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        // Display student information
        System.out.println("Student Information:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Add a new student
        Student newStudent = new Student("John Doe", 20, "Computer Science");
        students.add(newStudent);

        // Write student information to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            for (Student student : students) {
                writer.write(student.getName() + ", " + student.getAge() + ", " + student.getDepartment());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
