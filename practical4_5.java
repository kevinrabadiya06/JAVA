public class practical4_5 {
    public static void main(String[] args) {
        // Creating instances of Undergraduate and Postgraduate
        Undergraduate u1 = new Undergraduate();
        Postgraduate p1 = new Postgraduate();
        
        // Calling methods on Undergraduate instance
        u1.getDegree();
        u1.degree();
        
        // Calling methods on Postgraduate instance
        p1.getDegree();
        p1.degree();
        
        // Print a message indicating the author of the program
        System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
    }
}

// Base class Degree with a method to display degree information
class Degree {
    // Method to display a generic degree message
    public void getDegree() {
        System.out.println("\"I got a degree\".");
    }
}

// Subclass Undergraduate extending Degree
class Undergraduate extends Degree {
    // Overridden method to display Undergraduate-specific message
    public void degree() {
        System.out.println("\"I am an Undergraduate\"");
    }
}

// Subclass Postgraduate extending Degree
class Postgraduate extends Degree {
    // Overridden method to display Postgraduate-specific message
    public void degree() {
        System.out.println("\"I am a Postgraduate\"");
    }
}
