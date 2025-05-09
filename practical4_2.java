import java.util.*;
public class practical4_2 {
    public static void main(String[] args) {
        // Creating an instance of the Employee class
        Employee e1 = new Employee();
        // Creating an instance of the Manager class
        Manager m1 = new Manager();
        
        // Collecting and displaying data for the Employee instance
        e1.get();
        System.out.println("-------------------------------");
        e1.print();
        System.out.println("-------------------------------");
        System.out.println("");
        
        // Collecting and displaying data for the Manager instance
        m1.get();
        System.out.println("-------------------------------");
        m1.print();
        System.out.println("-------------------------------");
        System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
    }
}

// Base class Member with common attributes and methods
class Member {
    String name;
    int age;
    long mobileNo;
    String address;
    float salary;
    Scanner sc = new Scanner(System.in);
    // Method to get data from user input
    public void getData() {
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("Age: ");
        age = sc.nextInt();
        System.out.println("Mobile number: ");
        mobileNo = sc.nextLong();
        sc.nextLine(); // Clear the buffer
        System.out.println("Address: ");
        address = sc.nextLine();
        System.out.println("Salary: ");
        salary = sc.nextFloat();
    }
    // Method to print the data
    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mobile number: " + mobileNo);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }
}
// Employee class extending Member with additional attribute
class Employee extends Member {
    String specialization;
    // Scanner object for input (can be removed if inherited from Member)
    Scanner sc = new Scanner(System.in);

    // Method to get data including specialization
    public void get() {
        getData(); // Call method from Member class
        sc.nextLine(); // Clear the buffer
        System.out.println("Specialization: ");
        specialization = sc.nextLine();
    }

    // Method to print data including specialization
    public void print() {
        printData(); // Call method from Member class
        System.out.println("Specialization: " + specialization);
    }
}

// Manager class extending Member with additional attribute
class Manager extends Member {
    String department;
    
    // Scanner object for input (can be removed if inherited from Member)
    Scanner sc = new Scanner(System.in);

    // Method to get data including department
    public void get() {
        getData(); // Call method from Member class
        sc.nextLine(); // Clear the buffer
        System.out.println("Department: ");
        department = sc.nextLine();
    }

    // Method to print data including department
    public void print() {
        printData(); // Call method from Member class
        System.out.println("Department: " + department);
    }
}
