/**
 * @author- Biswajit Sundara
 * @Date - 06/12/2016
 * @Desc - Find all alphabets, numbers and special characters in a given string
 * 
 * @Input - "Welcome01$$to02first automation03!@!!"
 * 
 */

package codes.strings;

public class FindAlphaNumerics {

	public static void main(String[] args) {

		String str = "Welcome01$$to02first automation03!@!!"; 
		StringBuffer alpha = new StringBuffer();  
		StringBuffer num = new StringBuffer(); 
		StringBuffer special = new StringBuffer(); 

		for (int i=0; i<str.length(); i++) 
		{ 
			if (Character.isDigit(str.charAt(i))) 
				num.append(str.charAt(i)); 
			else if(Character.isAlphabetic(str.charAt(i))) 
				alpha.append(str.charAt(i)); 
			else
				special.append(str.charAt(i)); 
		} 

		System.out.println("Alphabetics from the string = " +alpha); 
		System.out.println("Numbers from the string = " +num); 
		System.out.println("Special Characters=" +special);

	}

}
