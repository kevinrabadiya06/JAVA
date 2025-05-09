public class practical7_1 extends Thread {
    // Override the run method to define the thread's behavior
    public void run() {
        // Print a message when the thread runs
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        // Create an instance of the thread
        practical7_1 obj = new practical7_1();
        // Start the thread, which will invoke the run method
        obj.start();
    
        System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
    }
}
