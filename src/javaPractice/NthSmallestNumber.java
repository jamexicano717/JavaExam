package javaPractice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NthSmallestNumber {

	public static void main(String[]args) {
		// Generate 500 random numbers
		int[] randomNumbers = new int[500];
		Random random = new Random();
		
		for (int i = 0; i <500; i++) {
			randomNumbers[i] = random.nextInt(1000) + 1;
		}
		
		//Sort the array of random numbers
		Arrays.sort(randomNumbers);
		
		//Ask user for the value of N
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of N for the Nth Smallest number: ");
		int n = scanner.nextInt();
		
		//Ensure N is within the valid range
		if (n<1 || n > randomNumbers.length) {
			System.out.println("invalid Value of N.");
		} else {
			int nthSmallest = randomNumbers[n-1];
			System.out.println("The " + n + "th smallest number is: " + nthSmallest);
		}
		
		
		/*In this Java example, an array of size 500 is used to store the randomly generated numbers. 
		The Random class is used to generate random numbers between 1 and 1000. The array is sorted using Arrays.sort(), 
		and then the user is prompted to input the value of N. The program checks if the input value of N is within a valid range and 
		then prints the Nth smallest number from the sorted array.
		*/
		
		
		
	
		}
		
	

}	
		
		





