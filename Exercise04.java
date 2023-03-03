// Java program to Sort a String Alphabetically
// Using toCharArray() method
// Without using sort() method

// Importing required classes
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

// Main class
class Exercise04 {

    public static String sort (String s ){
	
		// Converting string into an array for computation
		char arr[] = s.toCharArray();

		// Nested loops for comparison of characters
		// in above character array
	
		char temp;

		int i = 0;
		while (i < arr.length) {
			int j = i + 1;
			while (j < arr.length) {
				if (arr[j] < arr[i]) {
				
					// Comparing the characters one by one
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j += 1;
			}
			i += 1;
		}
        String output =String.valueOf(arr);  
		// By now loop is done means we have
		// iterated the whole array
		return output;
    }
	// Main driver method
	public static void main(String[] args) throws Exception
	{
		// Custom string input
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter a String: ");
    
        String userName = myObj.nextLine();  // Read user input
	
		System.out.println("The sorted string is: "+sort(userName.toLowerCase()));
	}
}
