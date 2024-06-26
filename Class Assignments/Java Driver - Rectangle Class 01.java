//import Scanner for input
import java.util.Scanner;


class Rectangle { // Rectangle class
    public double lengthSide;
    public double widthSide;


    Rectangle() { // Rectangle constructor
        lengthSide = 1.0;
        widthSide = 1.0;
    }
    
    double accessLength() {     // accessor for length
        return lengthSide;
    }
    
    double accessWidth() {     // accessor for width
        return widthSide;
    }
    

    void setLength(double userLength){    // mutator for length
        if((userLength > 0.0) && (userLength < 20.0)) {
            lengthSide = userLength;
        }
    }

    void setWidth(double userWidth){      // mutator for width
        if((userWidth > 0.0) && (userWidth < 20.0)) {
            widthSide = userWidth;
        }
    }
    

    double calculatePerimeter() {     // Perimeter method
        return 2 * (lengthSide + widthSide);
    }
    

    double calculateArea() { 	// Area method
        return lengthSide * widthSide;
    }

}

public class Driver {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); // declare scanner object
        
        //user variables for length and width
        double length = 0.0;
        double width = 0.0;

        Rectangle rectangle = new Rectangle(); // declare Rectangle object 

        System.out.print("Enter length of rectangle:"); // ask user for length
            length = input.nextDouble(); // read length
            rectangle.setLength(length); // check to see if the length is within parameters

        System.out.print("Enter width of rectangle:"); // ask user for width
            width = input.nextDouble(); // read width
            rectangle.setWidth(width); // check to see if the width is within the parameters

        System.out.print("Area: " + rectangle.calculateArea() + ", "); // call Area method and print the result
        System.out.println("Perimeter: " + rectangle.calculatePerimeter()); // call the Perimeter method and print it

    }
}
