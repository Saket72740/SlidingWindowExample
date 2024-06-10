package fixed_sliding_window;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MaximumInSubArray {

	// we have to find maximum number in every subarray of size k
	
	private List<Integer> findMaximumNumbers(int[] arr, int k) {
		// TODO Auto-generated method stub
		Deque<Integer> queue = new LinkedList<>();
		List<Integer> result = new ArrayList<>();
		int i = 0;
		int j = 0;
		while(j < arr.length) {
			while(queue.size() > 0 && arr[j] > queue.peekFirst()) {
				queue.removeFirst();
			}
			if(j-i+1 < k) {
				queue.addLast(arr[j]);
			}
			else {
				queue.addLast(arr[j]);
				result.add(queue.getFirst());
				if(queue.peekFirst() == arr[i]) {
					queue.removeFirst();
				}
				i++;
			}
			j++;
		}
		return result;
	}
	public List<Integer> getMaximumList(int arr[], int k){
		
		return findMaximumNumbers(arr, k);
		
	}
	
}
