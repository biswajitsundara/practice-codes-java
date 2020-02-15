/**
 * @author- Biswajit Sundara
 * @Date - 02/08/2015
 * @Desc - Find uncommon characters between two strings
 * 
 */

package codes.strings;

public class StringUncommonChars {

	public static void main(String[] args) {

		String str = "code for me";
		String str2 = "my rough code";

		for (char c : str.toCharArray()) {
			for (char d : str2.toCharArray()) {
				if (c == d) {
					str2 = str2.replace(d, ';');
				}
			}
		}
		
		str2 = str2.replaceAll(";", "");
		
		System.out.println(str2);
	}

}
