import java.util.*;
public class practical2_5 {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[]= str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String result =" ";
            for (int j = arr[i].length()-1; j >= 0; j--) {
             result = result + arr[i].charAt(j);
                
            }
            System.out.print(result);
            System.out.print(" ");
            System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
        }

    }
}
