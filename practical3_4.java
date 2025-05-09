import java.util.*; 
public class practical3_4 { 
        public static void main(String[] args) { 
        date d1 = new date(); // Create an instance of the 'date' class
        d1.getdata(); // Call the method to get date input from the user
        System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
    }
}

// Define the 'date' class to handle date validation and display
class date {
    int date, month, year, count = 0; // Instance variables to store date components and validation counter

    // Method to get date input from the user
    public void getdata() {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt and read the date
        System.out.println("Enter Date: ");
        date = sc.nextInt();
        
        // Prompt and read the month
        System.out.println("Enter Month: ");
        month = sc.nextInt();
        
        // Prompt and read the year
        System.out.println("Enter Year: ");
        year = sc.nextInt();

        // Validate the entered date
        validdate();
    }

    // Method to validate the entered date
    public void validdate() {
        // Check if the day is valid (greater than 31 is invalid)
        if (date > 31) {
            System.out.println("Invalid date"); // Print error message
            count++; // Increment the error counter
        }
        
        // Check if the day is valid for February (month 2)
        if (date > 29 && month == 2) {
            System.out.println("Invalid date"); // Print error message
            count++; // Increment the error counter
        }
        
        // Check if February 29 is valid for non-leap years
        if (date == 29 && month == 2 && year % 4 != 0) {
            System.out.println("Invalid date"); // Print error message
            count++; // Increment the error counter
        }
        
        // Check if the day is valid for months with only 30 days
        if (date == 31 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            System.out.println("Invalid date"); // Print error message
            count++; // Increment the error counter
        }
        
        // Check if the month is valid (should be between 1 and 12)
        if (month >= 13) {
            System.out.println("Invalid date"); // Print error message
            count++; // Increment the error counter
        }
        
        // If there are no errors, print the date
        if (count == 0) {
            printdata(); // Call method to print the date
        }
    }

    // Method to print the date in the format DD/MM/YYYY
    public void printdata() {
        System.out.println("Date: " + date + "/" + month + "/" + year); // Print the valid date
    }
}
