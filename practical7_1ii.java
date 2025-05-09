public class practical7_1ii implements Runnable {
    // Override the run method to define the thread's behavior
    public void run() {
        // Print a message when the thread runs
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        // Create a new Thread object with an instance of practical7_1ii as the target
        Thread obj = new Thread(new practical7_1ii());
        // Start the thread, which will invoke the run method
        obj.start();
        System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
    }
}
