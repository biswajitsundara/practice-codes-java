/**
 * @author- Biswajit Sundara
 * @Date - 04/02/2015
 * @Desc - program to reverse the given number
 * 
 */

package codes.numbers;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		
		//Declare Variable
		int number;
		int revnumber=0;
		int quo;

		//Instantiate Scanner Class
		Scanner sc= new Scanner(System.in);

		//Read the number
		System.out.println("Enter a number");
		number= sc.nextInt();


		//Using loop reverse the number
		while (number>0)
		{
			quo= number%10;

			revnumber=(revnumber*10)+quo;
			number=number/10;

		}

		//Print the reversed number 
		System.out.println("The reversed number=" + revnumber);
		
		
		//Close the scanner object
		sc.close();

	}

}
