/**
 * @author- Biswajit Sundara
 * @Date - 04/03/2016
 * @Desc - Java program to sort a string alphabetically
 * 
 */

package codes.strings;

import java.util.Arrays;

public class SortCharactersString {

	public static void main(String[] args) {

		String str = "codeformeandyou";

		// convert input string to char array 
		char tempArray[] = str.toCharArray(); 

		// sort tempArray 
		Arrays.sort(tempArray); 

		// return new sorted string 
		System.out.println(tempArray);


	}

}
