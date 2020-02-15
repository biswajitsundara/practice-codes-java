/**
 * @author- Biswajit Sundara
 * @Date - 12/10/2015
 * @Desc - Java program to ReverseString
*/

package codes.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

	static String str="I am doing good";


	public static void methodone()
	{
		//Using built in reverse() method of the StringBuilder class
		StringBuilder  sbr = new StringBuilder();
		sbr.append(str);
		sbr = sbr.reverse();
		System.out.println("The reversed string =" +sbr);
	}


	public static void methodtwo()
	{
	   //convert String to character array
	   //Print character from the last position	
       char[] cstr = str.toCharArray();
       int len= cstr.length;
       for (int i=len-1;i>=0;i--)
    	   System.out.print(cstr[i]);
	}
	
	

	public static void methodthree()
	{
		char[] cstr = str.toCharArray();
		List<Character> arlst= new ArrayList<>();
		for(char c:cstr)
		arlst.add(c);
		
		Collections.reverse(arlst);
		
		ListIterator li = arlst.listIterator();
		while (li.hasNext())
		System.out.print(li.next());
	}
	

	public static void main(String args[])
	{
		System.out.println("The string is = "+str);
		methodone();
		//methodtwo();
		//methodthree();
	}
}
