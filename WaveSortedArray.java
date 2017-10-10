
public class WaveSortedArray {

	void waveSort(int[] arr) {
		
		for(int i = 1; i < arr.length; i = i + 2) {
			if(arr[i] > arr[i - 1]) {
				swap(arr, i, (i - 1));
			}
			if(arr[i] > arr[i + 1]) {
				swap(arr, i, (i + 1));
			}
 		}
	}
	
	void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void main(String[] args) {
		
		WaveSortedArray w = new WaveSortedArray();
		
		int[] arr = {10, 90, 49, 2, 1, 5, 23};
		w.waveSort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}	
	}
}
