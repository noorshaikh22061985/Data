package arrays;

import java.util.Scanner;

//Read Matrix from KB
public class Simple2DArray {

	public static void main(String[] args) {
		
		int a[][] = new int[2][3];
		int i,j;
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i<2;i++) {
			for(j=0;j<3;j++) {
				System.out.println("Enter value: ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("\n Matrix - A :");
		for(i=0;i<2;i++) {
			for(j=0;j<3;j++) {
				System.out.println(" " + a[i][j]);
			}
			System.out.println();
		}
	}
}
