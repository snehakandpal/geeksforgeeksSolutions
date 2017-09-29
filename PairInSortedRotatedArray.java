
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
		
		while(max > min) {
			int sum = arr[max] + arr[min];
			if (sum == x)
				System.out.print("True. The pair is (" + arr[max] + ", " + arr[min] + ".");
			else if(sum > x)
				max--;
			else
				min++;
		}
	}
	
	public static void main(String[] args) {
		
		PairInSortedRotatedArray p = new PairInSortedRotatedArray();
		
		int arr[] = {11, 15, 6, 8, 9, 10};
		int x = 16;
		
		p.findPair(arr, x);
	}
}