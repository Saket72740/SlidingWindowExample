package sliding_windows;

import fixed_sliding_window.CountAnagram;
import fixed_sliding_window.FirstNegativeNumberWindow;
import fixed_sliding_window.MaximumInSubArray;
import fixed_sliding_window.MaximumSumsubArray;
import variable_sliding_window.LongestSubStringKUniqueChar;
import variable_sliding_window.LongestSubstringNonRepeatingChar;
import variable_sliding_window.MaximumSumOfPostiveSubArray;
import variable_sliding_window.MinimumWindowSubsring;

public class Main {
	public static void main(String args[]) {
		
//		MaximumSumsubArray maxSum = new MaximumSumsubArray();
//		int res = maxSum.getMaxSum(new int[] {2,5,-7,3,4,2,-1}, 3);
//		System.out.println(res);
		
//		FirstNegativeNumberWindow firstNegative = new FirstNegativeNumberWindow();
//		System.out.println(firstNegative.getResult(new int[] {12,-1,-7,8,-15,30,13,28}, 3));
		
//		MaximumInSubArray maxElementList = new MaximumInSubArray();
//		System.out.println(maxElementList.getMaximumList(new int[] {1,3,-1,-3,5,3,6,7}, 3));
		
//		CountAnagram countAnagram = new CountAnagram();
//		int count = countAnagram.getCountAnagrams("RAMA_RAMA_RET_TE_RET_TE RAMA_RAMA_RET_TE_RET_TE", "RAM");
//		System.out.println(count);
		
//		System.out.println("Hello");
//		MaximumSumOfPostiveSubArray maximumSum = new MaximumSumOfPostiveSubArray();
//		int count = maximumSum.getMaximumSize(new int[] {4,1,1,1,2,3,5}, 5);
//		System.out.println(count);
		
//		LongestSubStringKUniqueChar longestSubString = new LongestSubStringKUniqueChar();
//		int count = longestSubString.getLongestSubString("aabacebebebe", 3);
//		System.out.println(count);
		
//		LongestSubstringNonRepeatingChar longestSubString = new LongestSubstringNonRepeatingChar();
//		int count = longestSubString.getLongestSubString("abade");
//		System.out.println(count);
		
		MinimumWindowSubsring minWindow = new MinimumWindowSubsring();
		System.out.println(minWindow.getMinimumSubstringWindow("ADOBECODEBANC", "ABC"));
	}
}
