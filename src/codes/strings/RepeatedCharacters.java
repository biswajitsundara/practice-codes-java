/**
 * @author- Biswajit Sundara
 * @Date - 06/07/2015
 * @Desc - Remove repeated characters from a string
*/


package codes.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatedCharacters {

	public static void main(String[] args) {
		
		String str="India is myy country";
		Map<Character, Integer> baseMap = new HashMap<Character, Integer>();  
		
		char chrArr[]= str.toCharArray();
		for(char ch:chrArr)
		{
			if(baseMap.containsKey(ch))
			baseMap.put(ch, baseMap.get(ch)+1);
			
			baseMap.put(ch, 1);
		}
		
		System.out.println(baseMap);
		Set<Character> keys= baseMap.keySet();
		for(char ch:keys)
		{
			if(baseMap.get(ch)>1)
			System.out.println(ch+" is repeated " +baseMap.get(ch)+" times");	
		}

	}

}
