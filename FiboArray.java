package arrays;

/**
 * 
 * Fibonacci Using Array.
 *
 */
public class FiboArray {
	
	public static void main(String[] args) {
		
		int n, i;
		int a[] = new int[20];
		
		n = Integer.parseInt(args[0]);
		
		a[0] = 0;
		a[1] = 1;
		
		for(i=2; i<n; i++) {
			a[i] = a[i-1] + a[i-2];
		}
		
		for(i=0; i<n; i++) {
			System.out.println(" " + a[i]);
		}
	}

}
