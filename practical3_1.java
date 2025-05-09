import java.util.*; 

public class practical3_1 { 
        public static void main(String[] args) { 
        System.out.println("enter amount pound"); // Prompt the user to enter an amount in pounds
        
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read user input
        int pound = sc.nextInt(); // Read the integer input from the user and store it in the variable 'pound'
        
        // Convert the amount in pounds to rupees (assuming 1 pound = 100 rupees) and display it
        System.out.println("amount in rupees: " + (pound * 100));
        
        
        System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
    }
}