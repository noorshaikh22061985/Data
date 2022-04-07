package arrays;

public class MatrixTranspose {

	public static void main(String[] args) {

		int i,j;
		int b[][] = new int[3][3];

		int a[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};

		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				b[i][j] = a[j][i];
			}
		}

		System.out.println("The Transpose of matrices is :");

		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.println(" " + b[i][j]);
			}
			System.out.println();
		}

	}
}