// Simple Calculator.java
// Program calculates the value of two integers

import java.util.Scanner; // program uses class Scanner

public class integerIO {
   // main method begins execution of Java application
   public static void main(String[] args) {
      // create a Scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);

      System.out.print("Enter first integer: "); // prompt 
      int number1 = input.nextInt(); // read first number from user

      System.out.print("Enter second integer: "); // prompt 
      int number2 = input.nextInt(); // read second number from user

      int sum = number1 + number2; // add numbers, then store total in sum
      System.out.println(number1+ "+" +number2+ "=" + sum); // display equation and answer
      
      int product = number1 * number2; // multiply numbers; store answer in product
      System.out.println(number1+ "*" +number2+ "=" + product); // display equation and answer
      
      int difference = number1 - number2; // subtract numbers; store answer in difference
      System.out.println(number1+ "-" +number2+ "=" + difference); // display equation and answer
      
      int quotient = number1 / number2; // divide numbers; store answer in quotient
      System.out.println(number1+ "/" +number2+ "=" + quotient); // display equation and answer
	   
   } // end method main
} // end class integerIO
