/**
 * @author- Biswajit Sundara
 * @Date - 06/12/2015
 * @Desc - Swap two numbers without using third variable
 * 
 * @Input - a=2, b=3
 * @Output - a=3, b=2
 */

package codes.numbers;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {

		//1.Instantiate scanner class
		Scanner sc= new Scanner(System.in);


		//2.Read inputs from user
		System.out.println("Enter value of a=");
		int a= sc.nextInt();

		System.out.println("Enter value of b=");
		int b= sc.nextInt();

        
		//3.Print the numbers before swap
		System.out.println("Before Swap: a="+a+" b=" +b);

		
		//4. Swap the numbers
		a=a+b;
		b=a-b;
		a=a-b;
	
		
	   //5.Print the numbers after swap 	
	   System.out.println("After Swap: a="+a+" b=" +b);
	   
	   
	   //6.Close the scanner object
	   sc.close();
	}

}
