/**
 * @author- Biswajit Sundara
 * @Date - 10/03/2015
 * @Desc - Sort an array of numbers in ascending or descending.
 * 
 */

package codes.arrays;

import java.util.Scanner;

public class SortArrayNumbers {

	public static void main(String[] args) {

		//Declare Variables
		int n;
		int i,j,temp;

		//Instantiate the scanner class
		Scanner sc= new Scanner(System.in);

		//Enter how many number you want to work with
		System.out.println("Enter the number of integers to sort");
		n= sc.nextInt();

		//Create arrays to store the numbers
		int ascArray[]= new int[n];
		int dscArray[]= new int[n];

		//Read numbers from user input and store in arrays
		System.out.println("Enter "+n+" integers ");

		for(i=0;i<n;i++)
		{
			temp=sc.nextInt();
			ascArray[i]= temp;
			dscArray[i]= temp;
		}

		//Using for loop sort the array in ascending order
		for(i=0; i<(n-1); i++)
		{
			for(j=1;j<(n-i);j++)
			{
				if(ascArray[j-1]>ascArray[j])
				{
					temp=ascArray[j-1];
					ascArray[j-1]=ascArray[j];
					ascArray[j]=temp;

				}
			}
		}


		//Print the array sorted in ascending order
		System.out.println("The sorted list of integers in ascending order");

		for(i=0;i<n;i++)
		{
			System.out.println(ascArray[i]);
		}


		//Using for loop sort the array in descending order
		for(i=0; i<(n-1); i++)
		{
			for(j=1;j<(n-i);j++)
			{
				if(dscArray[j-1]<dscArray[j])
				{
					temp=dscArray[j-1];
					dscArray[j-1]=dscArray[j];
					dscArray[j]=temp;

				}
			}
		}


		//Print the array sorted in descending order
		System.out.println("The sorted list of integers in descending order");

		for(i=0;i<n;i++)
		{
			System.out.println(dscArray[i]);
		}


		//Close the scanner object
		sc.close();	

	}

}
