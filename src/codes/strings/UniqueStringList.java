/**
 * @author- Biswajit Sundara
 * @Date - 02/10/2015
 * @Desc - Print only unique values from the array
 * 
 */

package codes.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class UniqueStringList {
	

	public static void methodone()
	{
		String[] array = {"def", "abc", "hellow", "hey","def", "abc"};
	    Set<String> set = new HashSet<>();

		Collections.addAll(set, array);
		System.out.println("Unique using approach one");
		System.out.println(set);
	}
	
	

	public static void methodtwo()
	{
		String[] array = {"abcd", "def", "abc", "hellow", "hey","def"};
		Set<Object> strSet1 = Arrays.stream(array).collect(Collectors.toSet());
		System.out.println("Unique using approach two");
		System.out.println(strSet1);
	}
	
	
    
	//Unique and sorted list
	public static void methodthree()
	{
		String[] array = {"def", "abc", "hellow", "hey","def", "abc"};
	    Set<String> set = new TreeSet<>();

		Collections.addAll(set, array);
		System.out.println("Unique and Ascending");
		System.out.println(set);
	}


	public static void main(String args[])
	{
		methodone();
		methodtwo();
		methodthree();
	}
}
