package arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int i, j;
		int a[] = {40,20,50,10,30};
		
		System.out.println("\n Unsorted Numbers are = ");
		for(i=0; i<5;i++) {
			System.out.println(a[i] + " ");
		}
		
		int small, pos, tmp;
		for(i=0; i<5; i++) {
			small = a[i];
			pos = i;
			for(j=i+1;j<5;j++) {
				if(a[j] < small) {
					small = a[j];
					pos=j;
				}
			}
			tmp=a[i];
			a[i]=a[pos];
			a[pos]=tmp;
		}
		
		System.out.println("\n Sorted Numbers are =");
		for(i=0;i<5;i++) {
			System.out.println(a[i] + " ");
		}
		
	}

}
