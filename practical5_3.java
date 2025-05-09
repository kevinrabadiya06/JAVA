import java.util.Scanner;
public class practical5_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            // Call the modulus method with an array and an index that is out of bounds
            System.out.print("Enter the size of the array:");
            int arr[]=new int[sc.nextInt()];

            System.out.println("Enter the array :-");
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();  
            }

            System.out.println("Enter the index:");
            System.out.println(modulus(arr, sc.nextInt()));
        } 
        catch (Throwable e) {
            // Catch any throwable (including exceptions) and print the stack trace for debugging
            e.printStackTrace();  
        }

        // Print the final output indicating the end of the program
        sc.close();
        System.out.println();  
        System.out.println("This Practical is made by 23CS069-Megh Patel");
    }

    // Method to return the element at the specified index in the array 'a', throws an Exception
    public static int modulus(int a[], int b) throws Exception {
        try {
            // Try to return the value at index 'b' from array 'a'
            return a[b];  
        } 
        catch (IndexOutOfBoundsException e) {
            // If index is out of bounds, throw a new IndexOutOfBoundsException
            throw new IndexOutOfBoundsException();  
        }
    }
}
