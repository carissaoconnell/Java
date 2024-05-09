// Carissa Lee O'Connell
// java DuplicateElimination

import java.util.Scanner; // import scanner class
import java.util.Arrays; // import arrays class

class DuplicateElimination { // begin DuplicateElimination class

    // method to check if the input is already in the array
    public static boolean duplicate(int[] numbers, int size, int value) {
        // loop to check the input with each index in the array
        for(int i = 0; i < size; ++i) {
            if(numbers[i] == value) {
                return true;
            }
        }
        return false;
    } // end find method

    // main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // declare scanner object
        int[] numbers = new int[5]; // declare the array object
        int size = 0, value;
        
        // loop to acept input as long as it is less than the size of the array
        for(int i = 0; i < numbers.length; ++i) {
            // prompt message
            System.out.print("Enter an integer between 10 and 100:");
            // read the user's input
            value = input.nextInt();
            
            // loop that calls the find method to check if the input is already in the array
            if(duplicate(numbers, size, value)) {
                continue; // action to take if the input is already in the array
            } 
            else {
                System.out.println("This is the first time " + value + " has been entered"); // message if the value is not in the array
                numbers[size++] = value; // add the number to the array
            }
        }
        
		System.out.println("The complete set of unique values entered is:");
		
            // print out each number in the array
            for (int i = 0; i < size; ++i) { 
                System.out.println("Unique Value " + (i + 1) + ": is " + numbers[i]);
            }
    }

} // end DuplicateElimination class