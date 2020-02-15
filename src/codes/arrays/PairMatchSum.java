/**
 * @author- Biswajit Sundara
 * @Date - 10/03/2015
 * @Desc - Sum up all elements in a matrix and find a pair which sums up to a given element in an array. 
 * 
 */

package codes.arrays;

public class PairMatchSum 
{

	public static void main(String[] args) 
	{

		int[] arr = { 1, 5, 7, -1, 5 }; 
		
		int sum = 6; 

		// Prints number of pairs in arr[0..n-1] with sum equal 
		// to 'sum' 

		
		// Initialize counter
		int count = 0; 

		
		// Consider all possible pairs and check their sums 
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i + 1; j < arr.length; j++) 
			{	
				if ((arr[i] + arr[j]) == sum) 
				{
					count++; 
					System.out.println("Number 1= " + arr[i]);
					System.out.println("Number 2= " + arr[j]);
				}

			}
		}	
		
		System.out.printf("Count of pairs is %d",count); 

	}

}
