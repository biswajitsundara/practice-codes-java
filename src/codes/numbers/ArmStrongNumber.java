/**
 * @author- Biswajit Sundara
 * @Date - 05/11/2015
 * @Desc - Java program to print the ArmStrongNumber from 100 to 1000
 * 
 * @Note - 3 digit armstrong number is a number that is equal to the sum of cubes of its digits.
 * @Example - 153 is an armstrong number since 1^3 + 5^3 + 3^3 = 3+125+27 = 153 
 */

package codes.numbers;

public class ArmStrongNumber {

	public static void main(String[] args) {

		
		//Initialize variables
		int start=100;
		int end=1000;
		int i;
		int num;
		int sum=0;

		for (i=start;i<=end;i++)
		{
			
			//Assign the number to the variable
			num=i;
			sum=0;
			
			
			//Continue till the number is greater than zero
			while (num>0)
			{
				
				//Take digits from the number 
				int rem=num%10;
				
				//Divide the number by 10 since we have taken the first digit
				num=num/10;
				
				//Multiply the digit of the number by three times.
				sum= sum+(rem*rem*rem);
			}


			//Check if the number matches with the sum of the cube of the digits
			if(i==sum)
			{
				System.out.println(i+" is an armstrong number");
			
			}
		}
	}

}


