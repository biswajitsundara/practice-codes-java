/**
 * @author- Biswajit Sundara
 * @Date - 09/07/2015
 * @Desc - Arrange words in alphabetical order.
 * 
 */

package codes.strings;

import java.util.Arrays;


public class WordsFromSentence {

	public static void main(String[] args) {
		
		String sentence = "Hello My Friend How Are You?";
		
		String words[] = sentence.split("\\s");
		
		Arrays.sort(words);
		
		StringBuilder sb= new StringBuilder();
		
		for (String wd: words)
		{
			sb.append(wd);
			sb.append(" ");
		}

		System.out.println("The new sentence= " +sb);
	}

}
