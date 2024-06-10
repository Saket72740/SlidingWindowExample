package variable_sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringKUniqueChar {

	// In this problem we have to find the longest substring with K unique characters repeated or non-repeated characters.
	
	private int findLongestSubString(String str, int k) {
		Map<Character, Integer> mp = new HashMap<>();
		int i = 0;
		int j = 0;
		int max = -1;
		while(j < str.length()){
			mp.put(str.charAt(j), mp.getOrDefault(str.charAt(j), 0)+1);
			if(mp.size() < k) {
				j++;
			}
			else if(mp.size() == k){
				max = Math.max(max, j-i+1);
				j++;
			}
			else {
				while(mp.size() > k) {
					int temp = mp.get(str.charAt(i));
					if(temp == 1)
						mp.remove(str.charAt(i));
					else
						mp.put(str.charAt(i), temp-1);
					i++;
				}
			}
		}
		return max;
	}
	
	public int getLongestSubString(String str, int k) {
		return findLongestSubString(str, k);
	}
}
