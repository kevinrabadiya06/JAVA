import java.util.*;
public class practical2_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter String:");
        String st=sc.nextLine();
        System.out.println("enter number you want repeat:");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) 
        {
            if(st.length()==1 ||st.length()==2)
            {
                System.out.print(st);
            }
            else{
            System.out.print(st.substring(0, 3));
            }
        }
        System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
    }
}