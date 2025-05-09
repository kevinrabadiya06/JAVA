import java.util.*;
public class practical2_6 {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println("Length of string:"+ str.length());
        System.out.println("lower case:"+str.toLowerCase());
        System.out.println("upper case:"+str.toUpperCase());
        System.out.print("reverse string:");
        char arr[]=str.toCharArray();
        for (int i = str.length()-1;i>=0; i--) {
            System.out.print(arr[i]);
            
        }
      Arrays.sort(arr);
      System.out.println();
       System.out.println("sorted string:"+ new String(arr));
       System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
    }
}
