import java.io.*;  
import java.util.Scanner;  

public class practical6_1 {
    public static void main(String[] args) {
        // Create an array of File objects, one for each command-line argument
        File file[] = new File[args.length];  

        // Initialize each File object with the corresponding argument (file path)
        for (int i = 0; i < args.length; i++) {
            file[i] = new File(args[i]);  
        }

        for (int i = 0; i < file.length; i++) {
            try {
                // Create a Scanner object to read the content of the file
                Scanner fsc = new Scanner(file[i]);  
                int count = 0;  // Initialize a counter to count the number of lines

                // Loop through each line in the file
                while (fsc.hasNextLine()) {
                    fsc.nextLine();  // Read the next line
                    count++;  // Increment the line counter
                }

                // Print the file name and the total number of lines
                System.out.println(file[i].getName() + " : " + count);  
                fsc.close();  // Close the Scanner object
            } 
            catch (Exception e) {
                // If an error occurs (e.g., file not found), print an error message and the stack trace
                System.out.println("An error occurred");  
                e.printStackTrace();  // Print the stack trace for debugging
                System.out.println();  // Print an empty line for better readability
            }
        }
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");
        return;
    }
}