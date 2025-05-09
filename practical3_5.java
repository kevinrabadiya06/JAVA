import java.util.*; 

public class practical3_5 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        
        // Prompt the user to enter the length of the rectangle
        System.out.println("Enter length of rectangle:");
        double l = sc.nextDouble(); // Read the length input from the user
        
        // Prompt the user to enter the width of the rectangle
        System.out.println("Enter width of rectangle:");
        double w = sc.nextDouble(); // Read the width input from the user
        
        // Create an instance of the 'area' class with the given length and width
        area a1 = new area(l, w); 
        System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
    }
}

// Define the 'area' class to calculate and display the area of a rectangle
class area {
    double area; // Instance variable to store the area of the rectangle

    // Constructor that calculates the area of the rectangle
    public area(double l, double w) {
        area = l * w; // Calculate the area (length * width)
        // Print the c
        System.out.println("Area of rectangle: " + area);
    }
}