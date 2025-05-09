import java.io.*;
import java.util.*;

public class practical6_2 {
    public static void main(String[] args) {
        try {
            // Create a FileReader to read the specified file
            FileReader f1 = new FileReader("file2.txt");
          
            Scanner sc = new Scanner(f1);
            Scanner s = new Scanner(System.in);
            int count = 0; 
            System.out.println("enter a character to count in file:");
            char a = s.next().charAt(0); // Read the character input

            // Read the file line by line
            while (sc.hasNextLine()) {
                String str = sc.nextLine(); // Get the next line from the file
                char arr[] = str.toCharArray(); // Convert the line to a character array

                // Check each character in the line
                for (int i = 0; i < str.length(); i++) {
                    // Increment count if the character matches the input character
                    if (arr[i] == a) {
                        count++;
                    }
                }
            }
            System.out.println("total character in file: " + count);
        } catch (FileNotFoundException e1) {
            // Handle case where the file is not found
            System.out.println("File not found");
            e1.printStackTrace(); // Print the stack trace for debugging
        }

        
        System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
    }
}
