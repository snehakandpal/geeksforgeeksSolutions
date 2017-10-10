
public class ReverseArray {

	void reverseArr(int[] arr) {
		int f = 0;
		int r = arr.length - 1;
		
		while(f < r) {
			int temp = arr[f];
			arr[f] = arr[r];
			arr[r] = temp;
			f++;
			r--;
		}
	}
	
	public static void main(String[] args) {
		
		ReverseArray ra = new ReverseArray();
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		ra.reverseArr(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
