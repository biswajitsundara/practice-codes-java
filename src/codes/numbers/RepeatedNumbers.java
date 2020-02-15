/**
 * @author- Biswajit Sundara
 * @Date - 04/12/2017
 * @Desc - Write a program to find repeated numbers from an array
 * @company - Amazon
 * 
 */

package codes.numbers;

public class RepeatedNumbers {

	public static void main(String[] args) {
		
		int arr[]= {1,3,4,5,1,4,4};
		int counter=0;
		
		for(int i=0;i<arr.length;i++)
		{
			counter=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				counter++;	
			}
		
			if(counter>1)
			System.out.println(arr[i]+" is repeated " +counter);	
		}
		
	}

}
