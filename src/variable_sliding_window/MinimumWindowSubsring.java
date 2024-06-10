package variable_sliding_window;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubsring {
	
	// we have to find minimum size substring
	// which contains all the character of given string

	private String findMinimumSubstringWindow(String str, String p) {
		Map<Character, Integer> map = new HashMap<>();
		for(int i =0;i<p.length();i++) {
			map.put(p.charAt(i), map.getOrDefault(p.charAt(i), 0)+1);
		}
		int j = 0;
		int i = 0;
		int min = Integer.MAX_VALUE;
		String res = "";
		int count = map.size();
		while(j < str.length()) {
			while(count == 0) {
				if(map.containsKey(str.charAt(i))) {
					int temp = map.get(str.charAt(i));
					map.put(str.charAt(i), temp+1);
					if(temp == 0) {
						if(min > j-i+1) {
							res = str.substring(i, j);
						}
						count++;
					}
				}
				i++;
			}
			if(map.containsKey(str.charAt(j))){
				int temp = map.get(str.charAt(j));
				if(temp == 1)
					count--;
				map.put(str.charAt(j), temp-1);
			}
			j++;
		}
		while(count == 0) {
			if(map.containsKey(str.charAt(i))) {
				int temp = map.get(str.charAt(i));
				map.put(str.charAt(i), temp+1);
				if(temp == 0) {
					if(min > j-i+1) {
						res = str.substring(i, j);
					}
					count++;
				}
			}
			i++;
		}
		return res;
	}
	
	public String getMinimumSubstringWindow(String str, String p) {
		return findMinimumSubstringWindow(str, p);
	}
	
}
