/**
 * @author- Biswajit Sundara
 * @Date - 06/12/2015
 * @Desc - Return maximum occurring character in an input string
 * 
 */

package codes.strings;

import java.util.HashMap;
import java.util.Map;

public class MaxOccuringChar {

	public static void main(String[] args) {
		String str = "sample stringt"; 

		int maxCount =1;
		HashMap<Character, Integer> map = new HashMap<>();
		char[] chars = str.toCharArray();
		for (int i = 0; i <chars.length ; i++) {
			char c = chars[i];
			if(map.containsKey(c)){
				int count = map.get(c);
				count++;
				if(maxCount<count)
					maxCount++;
				map.put(c, count);
			}else{
				map.put(c, 1);
			}
		}

		System.out.println("max count=" +maxCount);
		
		for (Map.Entry<Character, Integer> entry : map.entrySet())  
		{
			//System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 

			if(entry.getValue()==maxCount)
			{
				System.out.println("Character: " + entry.getKey() + " has occurred max times:  " +  maxCount);
			}

		}

	}

}
