//In this code passing by value, passing by reference, returning values and returning objects from methods is used simultaneously

import java.util.Scanner;

public class practical3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //INPUTS
        System.out.print("Enter the name :");
        String name=sc.nextLine();
        System.out.print("Enter the age :");
        int age=sc.nextInt();

        Person p= getobject(name, age); //CREATING OBJECT

        //OUTPUT
        System.out.println("Name :"+p.get_name());
        System.out.println("Age :"+p.get_age());

        //NAME
        System.out.println();
        System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
        sc.close();

    }
    public static Person getobject(String name,int age) //PASS BY VALUE
    {
        return new Person(name, age);  //RETURNING OBJECTS
    }

}

class Person{ 
    String name;
    int age;

    Person(String name,int age) //PASS BY REFRENCE
    {
        this.name=name;
        this.age=age;
    }
    public String get_name() 
    {
        return name; //RETURNING VALUES
    }
    public int get_age()
    {
        return age; //RETURNING VALUES
    }
}