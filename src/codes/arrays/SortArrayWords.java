/**
 * @author- Biswajit Sundara
 * @Date - 10/03/2015
 * @Desc - Sort an array of strings/words in ascending or descending.
 * 
 */

package codes.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayWords {

	public static void main(String[] args) {

		String arr[] = {"world of titans", 
				"game of thrones", 
				"the lost world"
		}; 


		// Sorts arr[] in ascending order 
		Arrays.sort(arr); 
		System.out.printf("Array in ascending order: \n%s\n\n ", Arrays.toString(arr)); 

		// Sorts arr[] in descending order 
		Arrays.sort(arr, Collections.reverseOrder()); 

		System.out.printf("Array in descending order: \n%s\n\n ", Arrays.toString(arr)); 

	}

}
