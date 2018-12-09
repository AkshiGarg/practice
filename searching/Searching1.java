public class Searching1 {

	public static void main(String[] args) {
		
		int range = 7;
		int[] a = {1,7,1,2,1,2,3,3,3,4,2,4,5,5,5,6,6,7,6,4};
		int xorOfInput = -1;
		int xorOfRange = -1;
		for(int i = 0 ; i<a.length ; i++) {
			xorOfInput ^= a[i];
		}
		for(int i = 1; i <= range ; i++) {
			xorOfRange ^= i;
		}
		
		System.out.println(xorOfInput ^ xorOfRange);
		
	}
}
