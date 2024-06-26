// Carissa Lee O'Connell
// Java Invalid Side Exception

import java.util.Scanner; // import scanner class

    class InvalidSideException extends Exception { // InvalideSideException class inherits from Exception
        InvalidSideException(String message) { // exception called InvalidSideException
            super(message);
        }

    } // end InvalidSideException class

    class Square { // Square class
        int sideLength;
        public Square(int sideLength) // method to check length
            throws InvalidSideException {
                
                if (sideLength <= 0) { // throws exception if length is less than 0
                    throw new InvalidSideException("Side length must be greater than 0"); // message for exception
                } 

                else { // sets length to object sideLength
                    this.sideLength = sideLength;
                }
                
            } // end throw block

    public int getArea() { // getArea method
        int area;
        area =  this.sideLength * this.sideLength; // calculate area of square
        return area; // return the area of square
    } // end getArea method
    } // end Square class

    public class Driver { // driver class
        public static void main(String args[]) { // main method
            Scanner input = new Scanner(System.in); // declare scanner object
        
            System.out.print("Enter side length of square:"); // prompt message
            int length = input.nextInt(); // read user's input

            try {
                Square checkLength = new Square(length); // declare the square object
                System.out.println(checkLength.getArea()); // print area of square
            }
        
            catch (InvalidSideException ex) { // exception message
                System.out.print("Side length must be greater than 0.");
        
            }
        } // end main method
    } // end driver class