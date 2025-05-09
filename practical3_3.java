import java.util.*; 
public class practical3_3 { 
    public static void main(String[] args) { 
        // Create the first employee object and perform operations
        employee e1 = new employee(); // Instantiate an 'employee' object
        e1.getdata(); // Call the method to get data from the user
        e1.printdata(); // Call the method to print employee data
        e1.employeetest(); // Call the method to compute and print the raised salary

        // Create the second employee object and perform operations
        employee e2 = new employee(); // Instantiate another 'employee' object
        e2.getdata(); // Call the method to get data from the user
        e2.printdata(); // Call the method to print employee data
        e2.employeetest(); // Call the method to compute and print the raised salary
        System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
    }
}

// Define the 'employee' class to manage employee information
class employee {
    // Instance variables to store employee details
    String firstname; // Employee's first name
    String lastname; // Employee's last name
    double salary; // Employee's salary
    double raisesal; // Employee's salary after a raise

    // Method to get employee data from the user
    public void getdata() {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt and read employee's first name
        System.out.println("Enter First Name:");
        firstname = sc.nextLine();
        
        // Prompt and read employee's last name
        System.out.println("Enter Last Name:");
        lastname = sc.nextLine();
        
        // Prompt and read employee's salary
        System.out.println("Enter Salary:");
        salary = sc.nextDouble();

        // Ensure salary is non-negative
        if (salary <= 0) {
            salary = 0.0; // Set salary to 0 if a non-positive value is entered
        }
    }

    // Method to print employee data
    public void printdata() {
        // Print employee's full name and salary
        System.out.println("Name: " + firstname + " " + lastname);
        System.out.println("Salary: " + salary);
    }

    // Method to compute and print the salary after a 10% raise
    public void employeetest() {
        raisesal = salary + (salary * 0.1); // Calculate raised salary (10% increase)
        // Print the raised salary
        System.out.println("Raised Salary: " + raisesal);
    }
}
