/**
 * @author- Biswajit Sundara
 * @Date - 10/03/2015
 * @Desc - Find sum of the numbers in a given array
 * 
 */

package codes.arrays;

import java.util.Scanner;

public class SumOfArrayNumbers {

	public static void main(String[] args) {


		//Declare Variable
		int n;
		int i;
		int sum=0;


		//Instantiate scanner class
		Scanner sc= new Scanner(System.in);


		//Enter the number upto which we will check the prime numbers
		System.out.println("Enter the value of n:");
		n= sc.nextInt();
		int numbers[] = new int[n];

		
		//Read numbers from the user
		System.out.println("Enter numbers");
		for(i=0;i<n;i++)
		{
			numbers[i]= sc.nextInt();
		}

		
		//Using for loop add each number from the array
		for(i=0;i<n;i++)
		{
			sum=sum+numbers[i];
		}

		
		//Print the sum
		System.out.println("Sum of numbers in the array= "+sum);	

		
		//Close the scanner object
		sc.close();
	}

}
