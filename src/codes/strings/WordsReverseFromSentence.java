/**
 * @author- Biswajit Sundara
 * @Date - 09/08/2017
 * @Desc - Reverse alternate words in a sentence.
 * @Company - Amazon
 * 
 */

package codes.strings;

public class WordsReverseFromSentence {

	public static void main(String[] args) {
		
		String sentence = "This is no test";
		
		String words[] = sentence.split("\\s");
		
		int counter=1;
		
		StringBuilder sb= new StringBuilder();
		StringBuilder sent= new StringBuilder();
		
		for (String wd: words)
		{
			sb.delete(0, sb.length());
			sb.append(wd);

			if(counter%2==0)
			{					
				sb.reverse();
			}	
		
			counter++;
			sent.append(sb);
			sent.append(" ");
		}

		System.out.println("The new sentence= " +sent);
	}

}
