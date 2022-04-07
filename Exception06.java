package exceptionhandling;

//MultiExceptiona and single catch
public class Exception06 {

	public static void main(String[] args) {
		
		try {
			int a = args.length;
			System.out.println("a = " + a);
			int b = 10/a;
			int c[] = {1};
			c[10] = 100;
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught:" + e);
		}
		System.out.println("After try catch blocks");
	}
}
