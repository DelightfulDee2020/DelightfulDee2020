import java.util.Scanner;  // Needed for Scanner class

/**
   Denise Davis McNeill This programs shows values being stored in an array's elements and displayed.
*/

public class Array
{
   public static void main(String[] args)
   {
      final int NUM_ELEMENTS = 4; // Number of elements
      int[] numbers = new int[NUM_ELEMENTS]; // Array of numbers
   
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter the numbers of arrays " + 
                           NUM_ELEMENTS + " elements.");
      
      // Get the elements of number 1.
      System.out.print("Number 1:  ");
      numbers[0] = keyboard.nextInt();
      
      // Get the elements of number 0.
      System.out.print("Number 0: ");
      numbers[1] = keyboard.nextInt();
      
      // Get the elements of number 3
      System.out.print("Number 3: ");
      numbers[2] = keyboard.nextInt();
      
      // Get the elements of number 2.
      System.out.print("Number 2: ");
      numbers[3] = keyboard.nextInt();
      
      // Display the values entered.
      System.out.println("The numbers you entered are:");
      System.out.println("Number[1] = " + numbers[1]);
      System.out.println("Number[0] = " + numbers[0]);
      System.out.println("Number[3] = " + numbers[3]);
      System.out.println("Number[2] = " + numbers[2]);
   }
}
