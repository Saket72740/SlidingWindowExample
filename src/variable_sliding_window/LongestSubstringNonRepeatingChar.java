package variable_sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringNonRepeatingChar {
	
	
	private int findLongestSubString(String str) {
		int max = 1;
		int i=0, j=0;
		Map<Character, Integer> mp = new HashMap<>();
		while(j < str.length()) {
			mp.put(str.charAt(j), mp.getOrDefault(str.charAt(j), 0)+1);
			if(mp.size() == j-i+1) {
				max = Math.max(max, j-i+1);
			}
			else {
				while(mp.size() < j-i+1) {
					int temp = mp.get(str.charAt(i));
					if(temp == 1)
						mp.remove(str.charAt(i));
					else
						mp.put(str.charAt(i), temp-1);
					i++;
				}
			}
			j++;
		}
		while(mp.size() < j-i+1 && i < str.length()) {
			int temp = mp.get(str.charAt(i));
			if(temp == 1)
				mp.remove(str.charAt(i));
			else
				mp.put(str.charAt(i), temp-1);
			i++;
		}
		if(mp.size() == j-i+1) {
			max = Math.max(max, j-i+1);
		}
		return max;
	}
	
	public int getLongestSubString(String str) {
		return findLongestSubString(str);
	}
}
