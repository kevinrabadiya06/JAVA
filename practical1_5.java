import java.util.*;
public class practical1_5{
public static void main(String[] args) {
     int code_choice[]={1,2,3,4,5};
     int price[]={2000,3000,5000,7000,90000};
     String product_name[]={"motor","fan","tubelight","wires","other"};
     double payment_bill;
     for(int i=0;i<5;i++)
     {
         System.out.println(code_choice[i]+ " for " +product_name[i]);
     }
     System.err.println();
     System.out.println("enter choice:");
     Scanner sc = new Scanner(System.in);
     int choice=sc.nextInt();
     switch(choice){
        case 1:
            payment_bill=price[choice-1]+price[choice-1]*0.08;
            System.out.println("payment bill for "+product_name[choice-1]+" is " +payment_bill);
            break;
        case 2:
             payment_bill=price[choice-1]+price[choice-1]*0.12;
            System.out.println("payment bill for "+product_name[choice-1]+" is " +payment_bill);
            break;
        case 3:
             payment_bill=price[choice-1]+price[choice-1]*0.05;
            System.out.println("payment bill for "+product_name[choice-1]+" is " +payment_bill);
            break;
        case 4:
             payment_bill=price[choice-1]+price[choice-1]*0.075;
            System.out.println("payment bill for "+product_name[choice-1]+" is " +payment_bill);
            break;
        case 5:
             payment_bill=price[choice-1]+price[choice-1]*0.03;
            System.out.println("payment bill for "+product_name[choice-1]+" is "+payment_bill);
            break;
     }
     System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
}
}