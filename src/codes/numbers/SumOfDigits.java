/**
 * @author- Biswajit Sundara
 * @Date - 04/12/2016
 * @Desc - Find sum of digits of a number
 */


package codes.numbers;

public class SumOfDigits {

	static int number=532;


	public static void methodone()
	{
		int sum=0;
		while(number!=0)
		{
			int rem= number%10;
			number=number/10;
			sum=sum+rem;
		}
		System.out.println("Sum of digits=" +sum);
	}

	//We can use another approach using recursion	
	
	public static void methodtwo()
	{
		int result= sumdigit(number);
		System.out.println("sum of digits=" +result);
	}

	public static int sumdigit(int number)
	{
		if(number==0)
			return 0;

		else
			return(number%10+sumdigit(number/10));
	}
	
	public static void main(String args[])
	{
		methodone();
		//methodtwo();
	}

}
