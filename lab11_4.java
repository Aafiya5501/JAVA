import java.io.*;

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
    private static final String FILENAME = "students.dat";

    public static void main(String[] args) {
        // Populate some student data
        Student[] students = {
                new Student("Alice", 20, "Computer Science"),
                new Student("Bob", 21, "Electrical Engineering"),
                new Student("Charlie", 19, "Mathematics")
        };

        // Write student information to file
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(FILENAME)))) {
            for (Student student : students) {
                dos.writeUTF(student.getName());
                dos.writeInt(student.getAge());
                dos.writeUTF(student.getDepartment());
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Read student information from file
        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(FILENAME)))) {
            System.out.println("Student Information:");
            while (dis.available() > 0) {
                String name = dis.readUTF();
                int age = dis.readInt();
                String department = dis.readUTF();
                System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
