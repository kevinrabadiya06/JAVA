import java.util.*;

// Custom Exception class 'MyException' that extends the Exception class
class MyException extends Exception {
    static Scanner sc = new Scanner(System.in);  

    // Constructor for 'MyException' class, takes an object and passes it to the Exception class
    MyException(Object obj) {
        super("MyException[" + obj + "]");  // Customize the exception message
    }

    // Static method for performing division of two numbers, throws ArithmeticException on invalid division
    public static void Arithmetic() {
        System.out.print("Enter the value of a :");  
        double a = sc.nextDouble();  // Read the first number

        System.out.print("Enter the value of b :");  
        double b = sc.nextDouble();  // Read the second number

        // Check if the denominator is zero, throw an exception if true
        if (b == 0) {
            throw new ArithmeticException("Invalid division");  
        }

        // Perform the division and print the result
        System.out.println("a/b=" + a / b);  
        return;
    }

    // Static method to get a character at a specified index in a string, throws StringIndexOutOfBoundsException if the index is invalid
    public static void get_Value_at_String_index() {
        System.out.print("Enter the string:");  
        String str = sc.next();  // Read a string

        System.out.print("Enter the index :");  
        int index = sc.nextInt();  // Read the index

        // Check if the index is out of bounds, throw an exception if true
        if (index >= str.length()) {
            throw new StringIndexOutOfBoundsException("Index is invalid");  
        }

        // Print the character at the specified index
        System.out.println("Character=" + str.charAt(index));  
        return;
    }

    // Static method to get a value at a specified index in an array, throws ArrayIndexOutOfBoundsException if the index is invalid
    public static void get_Value_at_Array_index() {
        System.out.print("Enter the size of the array:");  
        int n = sc.nextInt();  // Read the size of the array

        System.out.print("Enter the space-separated integers in the array:");  
        int arr[] = new int[n];  // Initialize the array

        // Read integers into the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  
        }

        System.out.print("Enter the index :");  
        int index = sc.nextInt();  // Read the index

        // Check if the index is out of bounds, throw an exception if true
        if (index >= n) {
            throw new ArrayIndexOutOfBoundsException("Array index is invalid");  
        }

        // Print the integer at the specified index
        System.out.println("Integer=" + arr[index]);  
        return;
    }
}

public class practical5_2 {
    // Static Scanner object for reading input in main method
    static Scanner sc = new Scanner(System.in);  

    public static void main(String[] args) {
        try {
            // Handle ArithmeticException for invalid division
            try {
                MyException.Arithmetic();
            } catch (ArithmeticException e) {
                e.printStackTrace();  // Print the stack trace for debugging
            }

            // Handle NumberFormatException for invalid string to integer conversion
            try {
                System.out.println();
                System.out.print("Enter a String :");  
                String str = sc.next();  // Read a string

                // Try to parse the string into an integer, will throw NumberFormatException if invalid
                System.out.println("Integer=" + Integer.parseInt(str));  
            } catch (NumberFormatException e) {
                System.out.println("Format mismatch");  // Print a message for format mismatch
                e.printStackTrace();  // Print the stack trace for debugging
            }

            // Handle StringIndexOutOfBoundsException for invalid string index
            try {
                System.out.println();
                MyException.get_Value_at_String_index();
            } catch (StringIndexOutOfBoundsException e) {
                e.printStackTrace();  // Print the stack trace for debugging
            }

            // Handle ArrayIndexOutOfBoundsException for invalid array index
            try {
                System.out.println();
                MyException.get_Value_at_Array_index();
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();  // Print the stack trace for debugging
            }

            // Throw a custom user-defined exception and catch it
            try {
                System.out.println();
                System.out.println("User Defined Exception");

                // Manually throw an instance of MyException
                throw new MyException("23CS069");
            } catch (MyException e) {
                e.printStackTrace();  // Print the stack trace for debugging
            }

        } catch (Exception e) {
            // Catch any other exceptions and print their stack trace
            System.out.println("Exception encountered");  
            e.printStackTrace();
        } finally {
            // This block will always execute, indicating exception handling is complete
            System.out.println();
            System.out.println("Exception Handling Completed");
        }

        // Final output indicating the end of the program
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");
        return;
    }
}