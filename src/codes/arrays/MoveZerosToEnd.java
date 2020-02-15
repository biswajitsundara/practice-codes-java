/**
 * @author - Biswajit Sundara
 * @date - 10/12/2015
 * @Desc - Move all zeros to end of an array
 */
package codes.arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {

		int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9}; 
		int n = arr.length; 
        int temp;
		int count = 0;  

		// Traverse the array. If element encountered is 
		// non-zero, then replace the element at index 'count' 
		// with this element 
		for (int i = 0; i < n; i++) 
			if ((arr[i] != 0)) { 
		        temp = arr[count]; 
		        arr[count] = arr[i]; 
		        arr[i] = temp; 
		        count = count + 1; 
		    } 

		
		for (int i = 0; i < n; i++) 
		System.out.println(arr[i]);
		
	} 

}
