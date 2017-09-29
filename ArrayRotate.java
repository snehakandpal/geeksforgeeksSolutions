
public class ArrayRotate {
	 void rotate(int ar[], int d, int n) {
		 for(int i = 0; i < d; i++) {
			 rotateByOne(ar, n);
		 }
	 }
	 
	 void rotateByOne(int ar[], int n) {
		 int temp = ar[0];
		 int i;
		 for(i = 0; i < n - 1; i++) {
			 ar[i] = ar[i + 1];
		 }
		 ar[i] = temp;
	 }
	 
	 public static void main(String[] args) {
		 ArrayRotate r = new ArrayRotate();
	     int ar[] = {1, 2, 3, 4, 5, 6, 7};
	     r.rotate(ar, 4, 7);
	     for(int i = 0; i < 7; i++) {
	    	 System.out.print(ar[i] + " ");
	     }
	 }
}
