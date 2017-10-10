
public class PairInSortedRotatedArray {

	void findPair(int[] arr, int x) {
		
		int max = 0, min;
		
		for(int i = 1; i < arr.length - 1; i++) {
			if(arr[i] > arr[max])
				max = i;
			else
				break;
		}
		
		min = max + 1;
		
		while(max != min) {
			int sum = arr[max] + arr[min];
			if (sum == x) {
				System.out.print("True. The pair is (" + arr[max] + ", " + arr[min] + ").");
				return;
			}
			else if(sum > x) {
				max--;
				if (max < 0)
					max = arr.length - 1;
			}
			else
				min++;
				if (min == arr.length)
				min = 0;
		}
		
		System.out.print("Pair not found.");
	}
	
	public static void main(String[] args) {
		
		PairInSortedRotatedArray p = new PairInSortedRotatedArray();
		
		int arr[] = {11, 15, 26, 38, 9, 10};
		int x = 45;
		
		p.findPair(arr, x);
	}
}