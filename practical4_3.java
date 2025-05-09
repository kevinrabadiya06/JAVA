public class practical4_3 {
    public static void main(String[] args) {
        // Create an instance of the Rectangle class
        Rectangle r = new Rectangle(5.3, 2.4);
        r.printArea();
        r.printPerimeter();
        // Initialize an array of Square objects with size 10
        Square[] squares = new Square[10];
        // Create Square objects and add them to the array
        for (int i = 0; i < 10; i++) {  // Corrected the index range
            squares[i] = new Square(i + 1); // +1 to avoid zero size squares
        }
        // Print area and perimeter for each square
        for (Square sq : squares) {
            sq.printArea();
            sq.printPerimeter();
        }
        System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
    }
}
// Rectangle class with methods to calculate area and perimeter
class Rectangle {
    double length, breadth;
    // Constructor to initialize length and breadth
    public Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to print the area of the rectangle
    public void printArea() {
        System.out.println("Area: " + (length * breadth));
    }

    // Method to print the perimeter of the rectangle
    public void printPerimeter() {
        System.out.println("Perimeter: " + 2 * (length + breadth));
    }
}

// Square class extending Rectangle
class Square extends Rectangle {
     // Constructor to initialize a square (all sides are equal)
     public Square(double s) {
        super(s, s);
    }
}