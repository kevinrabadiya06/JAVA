import java.util.Scanner;

public class Practical_1_6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
        long n = sc.nextLong();
        
        System.out.print("Reversed number :");
        while(n>0)
        {
            long num=n % 10;
            n/=10;
            System.out.print(num);
        }
        System.out.println();
        System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
        sc.close();
    }
}
