/**
 * @author- Biswajit Sundara
 * @Date - 05/03/2015
 * @Desc - Java program to print the fibonacci series
 * 
 * @Input - Enter the value of n= 100
 * @Output - 0,1,1,2,3,5,8,13,21,34,55,89
 * 
 */

package codes.numbers;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {


		//Declare Variable
		int n;
		int pno=0;
		int cno=1;

		//Instantiate Scanner Class
		Scanner sc= new Scanner(System.in);

		//Read the number from user
		System.out.println("Enter a number:");
		n=sc.nextInt();

		//Print zero and one
		System.out.print(+pno+","+cno);

		//Using while loop keep on adding previous and current number
		while(cno<n)
		{    
			int temp=cno;
			cno=pno+cno;
			pno=temp;	
			if(cno<n)
			{
				System.out.print(","+cno);    
			}

		}    

		//Close the scanner object
		sc.close();	

	}

}
