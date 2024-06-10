package fixed_sliding_window;

public class MaximumSumsubArray {
	
	// find maximum sum subarray of size K
	
	private int maxSumSizeK(int arr[], int k) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int i=0;
		int j=0;
		while(j < arr.length) {
			if(j-i+1 < k) {
				sum += arr[j];
			}
			else {
				sum += arr[j];
				max = Math.max(sum, max);
				sum -= arr[i];
				i++;
			}
			j++;
		}
		return max;
	}
	
	public int getMaxSum(int arr[], int k) {
		return maxSumSizeK(arr, k);
	}

}
