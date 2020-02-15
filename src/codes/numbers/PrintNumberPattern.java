/**
 * @author- Biswajit Sundara
 * @Date - 03/04/2015
 * @Desc - Print patterns based on number divisible.
 * 
 * If number is divisible by 3 then print HELLO
 * If number is divisible by 5 then print HI
 * If not divisible by 3 or 5 then print the number itself
 */

package codes.numbers;

import java.util.Scanner;

public class PrintNumberPattern {

	public static void main(String[] args) {

		//1.Instantiate scanner class
		Scanner sc= new Scanner(System.in);

		//2.Read starting number from the user
		System.out.println("Enter the starting number:");
		int start= sc.nextInt();

		//3.Read starting number from the user
		System.out.println("Enter the ending number:");
		int end= sc.nextInt();

		//4.Using the for loop check divisible by 3 or 5
		for(int i=start;i<=end;i++)
		{
			if ((i%3==0) & (i%5!=0))
			{
				System.out.println("HELLO");
			}

			if ((i%5==0) & (i%3!=0))
			{
				System.out.println("HI");
			}

			if((i%3==0) & (i%5==0))
			{
				System.out.println("HELLOHI");
			}

			if((i%3!=0) & (i%5!=0))
			{
				System.out.println(i);
			}
		}


		//5.Close the scanner object
		sc.close();

	}

}
