package exceptionhandling;

//multi catch block
public class Exception05 {

	public static void main(String[] args) {
		
		try {
			int a = args.length;
			System.out.println("a = " + a);
			int b = 10/a;
			int c[] = {1};
			c[10] = 100;
		}catch(ArithmeticException e) {
			System.out.println("Divide by 0: " + e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index oob: " + e);
		}
		System.out.println("after try/catch blocks");
	}
}
