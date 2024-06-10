package variable_sliding_window;

public class MaximumSumOfPostiveSubArray {

	// In this problem we have to find maximum size of subarray with a given sum
	// Note -> This is applicable for positive numbers only
	
	private int findMaximumSize(int arr[], int k) {
		int i = 0, j = 0;
		int max = -1, sum = 0;
		while(j < arr.length) {
			if(sum < k) {
				sum += arr[j];
				j++;
			}
			else if(sum == k) {
				max = Math.max(max,  j-i);
				System.out.println(j + " " + i);
				sum += arr[j];
				j++;
			}
			else {
				while(sum > k) {
					sum -= arr[i];
					i++;
				}
			}
		}
		while(sum > k && i <arr.length) {
			sum -= arr[i];
			i++;
		}
		if(sum == k) {
			max = Math.max(max,  j-i);
			System.out.println(j + " " + i);
		}
		return max;
	}
	
	public int getMaximumSize(int arr[], int k) {
		return findMaximumSize(arr, k);
	}
	
}
