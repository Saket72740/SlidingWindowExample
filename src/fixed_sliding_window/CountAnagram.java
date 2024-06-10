package fixed_sliding_window;

import java.util.Arrays;

public class CountAnagram {
	 
	private int countNumberOfAnagrams(String a, String b) {
		// TODO Auto-generated method stub
		int CHARACTER = 256;
		int aArr[] = new int[CHARACTER];
		int bArr[] = new int[CHARACTER];
		int count = 0;
		int i = 0;
		for(;i < b.length();i++) {
			aArr[CHARACTER - a.charAt(i)]++;
			bArr[CHARACTER - b.charAt(i)]++;
		}
		if(Arrays.equals(aArr, bArr))
			count++;
		for(;i<a.length();i++) {
			aArr[CHARACTER - a.charAt(i)]++;
			aArr[CHARACTER - a.charAt(i-b.length())]--;
			if(Arrays.equals(aArr, bArr))
				count++;
		}
		return count;
	}
	
	public int getCountAnagrams(String a, String b) {
		return countNumberOfAnagrams(a, b);
	}
}
