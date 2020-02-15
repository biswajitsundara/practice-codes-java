/**
 * @author- Biswajit Sundara
 * @Date - 04/10/2015
 * @Desc - Java program to find duplicate numbers from an array
 * 
 */
package codes.numbers;

public class DuplicateNumber {

	public static void main(String args[])
	{

		int arr[]= {1,3,3,7,8,8,9};

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}
	}

}
