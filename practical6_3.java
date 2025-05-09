import java.io.*; 
import java.util.*; 

public class practical6_3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Create a BufferedReader to read from the file "File_6_3.txt"
        BufferedReader br = new BufferedReader(new FileReader("File_6_3.txt"));  

        // Prompt the user to enter a word to search for
        System.out.print("Enter the word :");
        String str = sc.next(); 

        String words[] = null;  // Array to store words from each line of the file
        String i;  // String to store each line of the file

        // Read the file line by line
        while ((i = br.readLine()) != null) {
            // Split each line into words using space as a delimiter
            words = i.split(" ");  

            // Loop through each word in the current line
            for (int j = 0; j < words.length; j++) {
                // If the input word matches any word in the line
                if (str.equals(words[j])) {
                    // Print message indicating the word was found and exit the program
                    System.out.println("The given word " + str + " is present in the file");
                    System.out.println();
                    System.out.println("This Practical is made by 23CS069-Megh Patel");
                    System.exit(0);  // Exit the program once the word is found
                }
            }
        }
        // Close the Scanner and BufferedReader objects to release resources
        sc.close();  
        br.close();  
        // If the word is not found, print a message
        System.out.println("The given word " + str + " is not present in the file");
        System.out.println();
        System.out.println("This Practical is made by 23CS069-Megh Patel");  // Final output
    }
}