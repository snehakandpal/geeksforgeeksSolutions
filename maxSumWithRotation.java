public class maxSumWithRotation {

	int findMaxSum(int[] arr) {
		
		int rotations = 0;
		int n = arr.length;
		int maxSum = calculateSum(arr);
		
		while(rotations < n) {
			rotate(arr, n);
			
			int sum = calculateSum(arr);
			if(sum > maxSum) 
				maxSum = sum;
			rotations++;
		}
		
		return maxSum;
	}
	
	int calculateSum(int[] arr) {
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum = sum + (i * arr[i]);
		}
		
		return sum;
	}
	
	void rotate(int[] arr, int n) {
		int temp = arr[n - 1];
		
		for(int i = n - 1; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		
		arr[0] = temp;
		
	}
	
	public static void main(String[] args) {
		
		maxSumWithRotation m = new maxSumWithRotation();
		
		int[] arr = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
				
		System.out.print(m.findMaxSum(arr));
	}
}
