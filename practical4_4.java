public class practical4_4 {
    public static void main(String[] args) {
        // Create an instance of class B
        B b1 = new B();
        // Call the display method to show values of x from both classes
        b1.display();
        // Print a message indicating the author of the program
        System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
    }
}
// Superclass A with a static variable x
class A {
    // Static variable x, shared among all instances of A and its subclasses
    protected static int x = 10;
}
// Subclass B extending A
class B extends A {
    // Instance variable x, hides the static variable x from superclass A
    private int x = 20;

    // Method to display the values of x from both class A and class B
    public void display() {
        // Access the static variable x from superclass A
        System.out.println("Value of x in class A: " + A.x);
        // Access the instance variable x from class B
        System.out.println("Value of x in class B: " + x);
    }
}
