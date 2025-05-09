import java.util.*;
public class practical2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter String:");
        String st=sc.nextLine();
        for (int i = 0; i < st.length(); i++) {
            System.out.print(st.substring(i, i+1));
            System.out.print(st.substring(i, i+1));
        }
        System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
    }
}
