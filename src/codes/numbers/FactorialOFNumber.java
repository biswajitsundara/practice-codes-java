/**
 * @author- Biswajit Sundara
 * @Date - 05/03/2015
 * @Desc - Print factorial of a number
 * 
 */

package codes.numbers;

import java.util.Scanner;

public class FactorialOFNumber {

	public static void main(String[] args) {

		//Declare variable
		int number;
		int fact=1;
		
		
		//Instantiate Scanner Class
        Scanner sc= new Scanner(System.in);
        
        
        //Read input from the user
        System.out.println("Enter a number:");
        number=sc.nextInt();
        
        
        //Using for loop determine the for loop
        System.out.print("Factorial of "+number+": ");
        for(int i=number; i>=1;i--)
        {
        	
        	fact=fact*i;
        	System.out.print(+i);
        	if(i>1)
        	{
        		System.out.print("*");
        	}
        	
        }
		
        
        //Print the factorial
        System.out.println("="+fact);
        
        
        //Close the scanner object
        sc.close();
	}

}
