package mypackage;

 import java.util.*;

 public class Descending {
     
     public static void main(String[] args) {
         int size;
         int i;

         Scanner input = new Scanner(System.in); // instantiate scanner object
         System.out.print("Enter the size of the array: ");
         size = input.nextInt();
         int[] array = new int[size]; // allow user to declare the array size
         
         // for loop to iterate the array size
         for (i = 0; i < size; i++) {
             System.out.print("Enter whole number: "); // prompt user to enter number
             array[i] = input.nextInt(); // enter user's number into array and get the next number
         } // end for loop
         
         Arrays.sort(array); // sort the array

         System.out.println("\nThe ascending order is:");
         System.out.println(Arrays.toString(array)); // print numbers in array in ascending order

         reverse(array); // reverse the array
         
         System.out.println("\nThe descending order is:");
         System.out.println(Arrays.toString(array)); // print numbers in array in descending order
         
     } // end main method
     
     
     // method to reverse numbers in the array
     public static void reverse(int[] array) {
             // Length of the array
             int n = array.length;
      
             // Swapping the first half numbers with last half numbers
             for (int i = 0; i < n / 2; i++) {
      
                 // Storing the first half numbers temporarily
                 int store = array[i];
      
                 // Assigning the first half of numbers to the last half
                 array[i] = array[n - i - 1];
      
                 // Assigning the last half to the first half
                 array[n - i - 1] = store;
             } // end for loop to sort numbers of array in reverse
         } // end reverse method
     
 } // end Descending class
     
   
 