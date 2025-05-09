public class practical3_2 { 
    public static void main(String[] args) { 
        // Create an instance of 'trianglearea' using the default constructor
        trianglearea t1 = new trianglearea();
        
        // Create an instance of 'trianglearea' using the constructor with one parameter (radius)
        trianglearea t2 = new trianglearea(4);
        
        // Create an instance of 'trianglearea' using the constructor with two parameters (length and width)
        trianglearea t3 = new trianglearea(5.3, 2.4);
        System.out.println("area of square: " + t1.area);
        System.out.println("area of circle: " + t2.area);
        System.out.println("area of triangle: " + t3.area);
        System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
    }
}

// Define the 'trianglearea' class to calculate areas of different shapes
class trianglearea {
    double area; // Instance variable to store the area

    // Default constructor, calculates the area of a square
    public trianglearea() {
        area = 15; // Arbitrary value representing the area of a square
    }

    // Constructor to calculate the area of a circle given its radius
    public trianglearea(double r) {
        area = 3.14 * r * r; // Area of the circle (π * r^2)
    }

    // Constructor to calculate the area of a triangle given its base and height
    public trianglearea(double l, double w) {
        area = 0.5 * l * w; // Area of the triangle (0.5 * base * height)
    }
}
