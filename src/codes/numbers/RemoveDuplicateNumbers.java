/**
 * @author- Biswajit Sundara
 * @Date - 10/12/2015
 * @Desc - Remove duplicate numbers from an array
 * 
 */

package codes.numbers;

public class RemoveDuplicateNumbers {

	
	public static void main(String[] args) {

		int arr[] = {10,20,20,30,30,40,50,50};  
		
		int n = arr.length;  
		
		int j = 0;//for next element  
        
		for (int i=0; i < n-1; i++)
        {  
            if (arr[i] != arr[i+1]){  
                arr[j++] = arr[i];  
            }  
        }  
        
        arr[j++] = arr[n-1];  
	 
        //The new size of the array is J
        
		for (int i=0; i<j; i++)  
			System.out.print(arr[i]+" ");  

	}

}
