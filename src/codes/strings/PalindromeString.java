/**
 * @author- Biswajit Sundara
 * @Date - 05/10/2016
 * @Desc - Program to check if the string is palindrome
 * 
 */

package codes.strings;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		//1.Instantiate the scanner class
		Scanner sc= new Scanner(System.in);
		
		//2.Read the string from user
		System.out.println("Enter the string:");
		String str= sc.next();
		
		//3.Reverse the string
		String reverse= new StringBuffer(str).reverse().toString();
		
		
		//4.Check if the string matches with the reversed string
		if(str.equals(reverse))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		
		
		//5.Close the scanner object
		sc.close();

	}

}


/*
 * Above code uses pre built methods. Another approach
 		int length = str.length();
 		for ( int i = length - 1; i >= 0; i-- )
        rev = rev + str.charAt(i);  
 *
*/
