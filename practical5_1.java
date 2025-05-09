import java.util.*;

public class practical5_1 {
    public static void main(String[] args) {
        int x = 0, y = 0;
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first value:");
        try {
            x = sc.nextInt();
        } catch (Exception error) {
            // Handle invalid input for the first value
            System.out.println("invalid input:");
        } 
        // Prompt the user to enter the second value
        System.out.println("enter second value");
        try { 
            y = sc.nextInt();
            // Check for division by zero
            if (y == 0) {
                throw new ArithmeticException(); // Throw exception if y is zero
            }
        } catch (Exception error) {
            // Handle invalid input for the second value
            System.out.println("invalid input:");
        }
        
        // Close the scanner to prevent resource leaks
        sc.close();
        System.out.println("result: " + (x / y));
        System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
    }
}
