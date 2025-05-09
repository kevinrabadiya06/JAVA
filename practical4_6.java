public class practical4_6 {
  public static void main(String[] args) {
      // Create an instance of class Q
      Q q = new Q();
      // Call methods from interface P1 and P2 implemented by Q
      q.display1();
      q.display2();
      q.display12();
      // Print a message indicating the author of the program
      System.out.println("This Practical is made by 23CS080 Rabadiya Kevin");
  }
}

// Interface P1 with a constant and a method
interface P1 {
  // Constant in interface
  String con1 = "This is P1 interface";
  
  // Method declaration
  void display1();
}

// Interface P2 with a constant and a method
interface P2 {
  // Constant in interface
  String con2 = "This is P2 interface";
  
  // Method declaration
  void display2();
}

// Interface P12 extending both P1 and P2, with an additional constant and method
interface P12 extends P1, P2 {
  // Constant in interface
  String con12 = "This is P12 interface";
  
  // Additional method declaration
  void display12();
}

// Class Q implementing interface P12
class Q implements P12 {
  // Implement method from P1
  @Override
  public void display1() {
      System.out.println(con1);
  }

  // Implement method from P2
  @Override
  public void display2() {
      System.out.println(con2); // Fixed to use con2
  }

  // Implement method from P12
  @Override
  public void display12() {
      System.out.println(con12);
  }
}
