package fixed_sliding_window;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeNumberWindow {

	// we have to find 1st negative number in every window of size K
	
	private List<Integer> findNegativeNumber(int arr[], int k){
		List<Integer> result = new ArrayList<>();
		List<Integer> lst = new ArrayList<>();
		int i = 0;
		int j = 0;
		while(j < arr.length) {
			if(j-i+1 < k) {
				if(arr[j] < 0) {
					lst.add(arr[j]);
				}
			}
			else {
				if(lst.size() > 0) {
					result.add(lst.get(0));
					if(arr[i] == lst.get(0)) {
						lst.remove(0);
					}
				}
				if(arr[j] < 0) {
					lst.add(arr[j]);
				}
				i++;
			}
			j++;
		}
		return result;
	}
	
	public List<Integer> getResult(int arr[], int k){
		return findNegativeNumber(arr, k);
	}
}
