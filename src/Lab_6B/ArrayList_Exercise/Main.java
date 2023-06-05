package Lab_6B.ArrayList_Exercise;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 2. Write a program that creates an ArrayList of double and performs the followings steps:
    * Insert 5 items into the list and Print the list
    * Delete 3rd item from the list and Print the list
    * Print the size of the list
    * Update the item in 2nd position with a user input and Print the list
    * Clear the list and print size of the list
 */
public class Main {
   public static void main(String[] args) {
      
      // creates an ArrayList of double 
      ArrayList<Double> numbers = new ArrayList<>();
   
      // Insert 5 items into the list and Print the list
      numbers.add(1.2);
      numbers.add(2.4);
      numbers.add(3.5);
      numbers.add(4.8);
      numbers.add(5.0);

      System.out.println("List after adding 5 items: " + numbers);

      // Delete 3rd item from the list and Print the list
      numbers.remove(2);

      System.out.println("List after removing 3rd itme: " + numbers);

      // Print the size of the list
      System.out.println("Size of the list: " + numbers.size());

      // Update the item in 2nd position with a user input and Print the list
      System.out.print("Enter value to Update the 2nd position: ");

      Scanner sc = new Scanner(System.in);
      numbers.set(1, sc.nextDouble());

      System.out.println("List after setting new item at 2nd position: " + numbers);

      // Clear the list and print size of the list
      numbers.clear();

      System.out.println("List after clearing the items:  " + numbers);
   }

}
