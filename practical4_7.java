import java.util.*;
// Define the Shapes interface with input and output methods
interface Shapes {
    void input();
    void output();
}
// Define the Signs class with common attributes and method to get them
class Signs {
    String text;
    String colour;  
    // Method to get common attributes
    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        text = sc.nextLine();
        System.out.println("Enter colour:");
        colour = sc.nextLine();
    }
}
// Circle class extending Signs and implementing Shapes
class Circle extends Signs implements Shapes {
    float radius;
    // Input method to get the radius of the circle
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        radius = sc.nextFloat();
    }
    // Output method to display the circle's details and area
    @Override
    public void output() {
        System.out.println("CIRCLE:");
        System.out.println("Text: " + text);
        System.out.println("Colour: " + colour);
        System.out.println("Area: " + (Math.PI * radius * radius)); // Using Math.PI for better precision
    }
}

// Rectangle class extending Signs and implementing Shapes
class Rectangle extends Signs implements Shapes {
    float length, breadth;

    // Input method to get the length and breadth of the rectangle
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        length = sc.nextFloat();
        System.out.println("Enter breadth:");
        breadth = sc.nextFloat();
    }
    // Output method to display the rectangle's details and area
    @Override
    public void output() {
        System.out.println("RECTANGLE:");
        System.out.println("Text: " + text);
        System.out.println("Colour: " + colour);
        System.out.println("Area: " + (length * breadth));
    }
}
public class practical4_7 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter '1' for Circle and '2' for Rectangle:");
        choice = sc.nextInt();
        
        // Handle user choice and instantiate the appropriate shape
        switch (choice) {
            case 1:
                Circle c = new Circle();
                c.get(); // Get common attributes
                c.input(); // Get circle-specific input
                c.output(); // Display circle details
                break;
            case 2:
                Rectangle r = new Rectangle();
                r.get(); // Get common attributes
                r.input(); // Get rectangle-specific input
                r.output(); // Display rectangle details
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }
        sc.close(); // Close Scanner after use
        System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
    }
}
