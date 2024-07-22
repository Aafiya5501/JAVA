// Parent class
class member {
     String name;
     int age;
     String phoneNumber;
     String address;
   double salary;

    // Constructor
    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display member details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }
}

// Child class inheriting from Member
class Employee extends Member {
     String specialization;

    // Constructor
    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    // Getter and setter for specialization
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Method to display employee details including specialization
    @Override
    public void display() {
        super.display();
        System.out.println("Specialization: " + specialization);
    }
}

// Child class inheriting from Member
class Manager extends Member {
     String department;

    // Constructor
    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    // Getter and setter for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Method to display manager details including department
    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects of Employee and Manager
        Employee emp = new Employee("John", 30, "1234567890", "123 Main St", 50000, "Software Engineer");
        Manager manager = new Manager("Alice", 35, "9876543210", "456 Broad St", 70000, "Human Resources");

        // Displaying details of Employee and Manager
        System.out.println("Employee Details:");
        emp.display();
        System.out.println();

        System.out.println("Manager Details:");
        manager.display();
    }
}