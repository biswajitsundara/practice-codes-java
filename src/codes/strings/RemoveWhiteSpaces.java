/**
 * @author- Biswajit Sundara
 * @Date - 06/05/2015
 * @Desc - Remove white spaces from a string
*/


package codes.strings;

public class RemoveWhiteSpaces {


	public static void methodone()
	{
		//1st method
		// using built in method

		String str = "India     Is My    Country";  
		String noSpaceStr = str.replaceAll("\\s", "");   
		System.out.println(noSpaceStr);  
	}


	public static void methodtwo()
	{
		//2nd method
		//Reading character by character

		String str = "India     Is My    Country";
		char[] strArray = str.toCharArray();  
		StringBuffer stringBuffer = new StringBuffer();  

		for (int i = 0; i < strArray.length; i++) 
		{  
			if ((strArray[i] != ' ') && (strArray[i] != '\t')) {  
				stringBuffer.append(strArray[i]);  
			}  
		}  
		String noSpaceStr = stringBuffer.toString();  
		System.out.println(noSpaceStr);  
	}


	public static void main (String args[])
	{
		methodone();
		methodtwo();
	}
}
