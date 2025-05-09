import java.util.*; 

public class practical3_6 { 
    public static void main(String[] args) { 
        System.out.println("Enter 1st number:");
        Scanner sc = new Scanner(System.in); 
        float real1 = sc.nextFloat(); // Read the real part of the first complex number
        float ima1 = sc.nextFloat(); // Read the imaginary part of the first complex number
        System.out.println("Enter 2nd number:");
        float real2 = sc.nextFloat(); // Read the real part of the second complex number
        float ima2 = sc.nextFloat(); // Read the imaginary part of the second complex number
        
        // Create an instance of the 'complex' class
        complex c1 = new complex();
        
        // Perform and display the sum of the two complex numbers
        System.out.println("Sum of two numbers:");
        c1.sum(real1, ima1, real2, ima2);
        
        // Perform and display the subtraction of the two complex numbers
        System.out.println("Subtraction of two numbers:");
        c1.sub(real1, ima1, real2, ima2);
        
        // Perform and display the multiplication of the two complex numbers
        System.out.println("Multiplication of two numbers:");
        c1.mul(real1, ima1, real2, ima2);
        System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
    }
}
class complex {
    // Method to calculate and display the sum of two complex numbers
    public void sum(float real1, float ima1, float real2, float ima2) {
        float realsum = real1 + real2; // Calculate the real part of the sum
        float imasum = ima1 + ima2; // Calculate the imaginary part of the sum
        // Print the sum in the format "a+bi"
        System.out.println(realsum + "+" + imasum + "i");
    }

    // Method to calculate and display the subtraction of two complex numbers
    public void sub(float real1, float ima1, float real2, float ima2) {
      float realsub = real1 - real2; // Calculate the real part of the difference
      float imasub = ima1 - ima2; // Calculate the imaginary part of the difference
      // Print the difference in the format "a+bi"
      System.out.println(realsub + "+" + imasub + "i");
  }

  // Method to calculate and display the multiplication of two complex numbers
  public void mul(float real1, float ima1, float real2, float ima2) {
      float realmul = (real1 * real2) - (ima1 * ima2); // Calculate the real part of the product
      float imamul = (real1 * ima2) + (real2 * ima1); // Calculate the imaginary part of the product
      // Print the product in the format "a+bi"
      System.out.println(realmul + "+" + imamul + "i");
  }
}