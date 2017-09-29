
public class ArrayClockwiseRotate {

	void rotate(int[] ar) {
		int temp = ar[ar.length - 1];
		
		for(int i = ar.length - 1; i > 0; i--) {
			ar[i] = ar[i-1];
		}
		
		ar[0] = temp;
		
	}
	
	public static void main(String[] args) {
		ArrayClockwiseRotate acr = new ArrayClockwiseRotate();
		
		int[] ar = {1, 2, 3, 4, 5, 6, 7};
		
		acr.rotate(ar);
		
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
		}
	}
}
