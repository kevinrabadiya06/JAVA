import java.util.*;
public class practical2_3 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter number of element:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter element:");
        for (int i = 0; i < n; i++) 
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for (int i = 0; i < 4; i++) {
            if(arr[i]!=9)
            {
                count++;
            }
            
        }
        if(count==4)
        {
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
        System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
   } 
}
