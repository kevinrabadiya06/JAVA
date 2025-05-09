public class practical4_1 {
    public static void main(String[] args) {
        // Creating an instance of the Parent class
        Parent p = new Parent();
        // Creating an instance of the Child class
        Child c = new Child();
        
        // Calling the method of the Parent instance
        p.method();
        // Calling the overridden method of the Child instance
        c.method();
        // Calling the method unique to the Child class
        c.get();
        System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
    }
}
class Parent {
    // Method that prints a message from the Parent class
    public void method() {
        System.out.println("This is parent class");
    }
}
class Child extends Parent {
    // Overriding the method from the Parent class
    @Override
    public void method() {
        System.out.println("This is child class");
    }
    // Method unique to the Child class
    public void get() {
        System.out.println("This is child class additional method");
    }
}
