/**
 * @author- Biswajit Sundara
 * @Date - 05/07/2015
 * @Desc - Java program to display first n prime numbers
 * 
 * @Input - Enter the value of n:30
 * @Output- 2,3,5,7,11,13,17,19,23,29
 */

package codes.numbers;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		
		//Declare Variables
		int n;
		int num;
		int i,j;
		int flag;

		
		//Instantiate scanner class
		Scanner sc= new Scanner(System.in);
		
		
		//Enter the number upto which we will check the prime numbers
		System.out.println("Enter the value of n:");
		n= sc.nextInt();

		
		//If the number is divisible by any other number set the flag
		for(i=2; i<=n;i++)
		{
			num=i;
			flag=0;
			for(j=2;j<num;j++)
			{
				if(num%j==0)
				{
					flag=1;
				}
			}

         //If the flag is not set, the number is not divisible by any other number
			if(flag==0)
				System.out.println(+num +" is a prime number");	
		}


		//Close scanner object
		sc.close();

	}

}
